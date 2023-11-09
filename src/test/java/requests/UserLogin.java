package requests;

import apiconfig.HeaderConfig;
import apiconfig.ParamsConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static base.Data.BASEURL;
import static base.Data.LOGIN;
import static org.hamcrest.Matchers.*;

public class UserLogin {
    RequestSpecification request ;
    Response response;
    ParamsConfig params = new ParamsConfig();
    HeaderConfig header = new HeaderConfig();
    public void navigatetobaseurl(){
        request= RestAssured.given();
        System.out.println("here is the base url " + BASEURL);

    }
    public Response login(String username, String Password){
        response =RestAssured.given().
                params(params.loginParams(username, Password))
                .headers(header.defaultHeaders()).
                when().get(LOGIN);
        System.out.println("here is login url ====> "+ BASEURL + LOGIN);
        return response;

    }
    public void validateLoginResponse(String username , String password){
        login(username , password).then()
                .assertThat().statusCode(200).
                assertThat().body("code",equalTo(200))
                .assertThat().body("type" , equalTo("unknown"))
                .assertThat().body("message" ,notNullValue());
    }
}
