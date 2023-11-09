package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import requests.PetRequest;
import responses.PetRes;

public class PetStepdefs {
    PetRequest req = new PetRequest();
    PetRes resp = new PetRes();

    @Given("I create pet with name {string}\"")
    public void iCreatePetWithName(String arg0) throws Throwable {
        System.out.println(arg0);
    }

    @Then("I should validate correct response with correct {string}")
    public void iShouldValidateCorrectResponseWithCorrect(String arg0) {
        resp.getPetResponse(req.sendCreateRequest(11111, arg0, "test", 123, "available", "tef"));
        System.out.println("Response Status Code: " + resp.getStatus());
        System.out.println("Response Type: " + resp.getName());
        Assert.assertTrue(resp.getName().equalsIgnoreCase(arg0));
    }
    }
