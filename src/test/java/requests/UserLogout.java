package requests;

import apiconfig.HeaderConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static base.Data.LOGOUT;

public class UserLogout {
    Response response ;
    RequestSpecification request ;
    HeaderConfig headers = new HeaderConfig();
    public Response logout(){
        response = RestAssured.given().headers(headers.defaultHeaders())
                .when().get(LOGOUT);

        return  response;
    }
    public void checkLogoutStatusCode(){
        logout().then().
                assertThat().statusCode(200);
    }
}
