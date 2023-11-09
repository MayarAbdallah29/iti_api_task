package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import requests.UserLogout;

import static base.Data.BASEURL;

public class LogoutStepdefs {
    UserLogout logout = new UserLogout();
    @Before
    public void setBAseURL(){
        RestAssured.baseURI = BASEURL;
    }

    @Then("i should get valid status code")
    public void iShouldGetValidStatusCode() {
        logout.checkLogoutStatusCode();
    }

    @Given("I logged out")
    public void iLoggedOut() {
        logout.logout();

    }
}
