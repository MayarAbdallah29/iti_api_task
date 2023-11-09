package requests;

import apiconfig.HeaderConfig;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;

import static base.Data.PET;

public class UserPet {
    HeaderConfig headers = new HeaderConfig();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(ArrayList<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public RequestSpecification getRequest() {
        return request;
    }

    public void setRequest(RequestSpecification request) {
        this.request = request;
    }

    public int id;
    public Category category;
    public String name;
    public ArrayList<String> photoUrls;
    public ArrayList<Tag> tags;
    public String status;
    Response response;
    RequestSpecification request;
    public static  class Category {
        public int id;
        public String name;

        public Category(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }


    public static class Tag{
        public int id;
        public String name;
    public Tag(int id , String name){
        this.id = id;
        this.name = name;

    }
    }

    public static Response sendCreateRequest(int id, String name, String photoUrl, int tagId, String tagName, String status) {
        this.id = id;
        this.name = name;
        this.photoUrls = new ArrayList<>();
        this.photoUrls.add(photoUrl);
        this.tags = new ArrayList<>();
        this.tags.add(new Tag(tagId, tagName));
        this.status = status;

        // Send a POST request using RestAssured
         response = RestAssured.given().log().all()
                .headers(headers.defaultHeaders())
                .body(this)
                .post(PET);


        // Print the response
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        return response;
    }
}
