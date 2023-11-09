package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import requests.UserLogin;

import static base.Data.BASEURL;

public class LoginStepdefs {
    UserLogin Login= new UserLogin();
    @Before
    public void setBaseUrl(){
        RestAssured.baseURI = BASEURL;
    }
    @Given("I navigate to the pet store")
    public void iNavigateToThePetStore() {
        Login.navigatetobaseurl();

    }

    @When("I login using valid credentials {string} and {string}")
    public void iLoginUsingValidCredentialsAnd(String arg0, String arg1) {
        Login.login(arg0, arg1);

    }

    @Then("I should get a correct response {string} and {string}")
    public void iShouldGetACorrectResponseAnd(String arg0, String arg1) {
        Login.validateLoginResponse(arg0 , arg1);

    }

}
