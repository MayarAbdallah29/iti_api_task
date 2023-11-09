package reponses;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;

public class PetRes {
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
    public class Category{
        public int id;
        public String name;
    }



    public class Tag{
        public int id;
        public String name;
    }
}
