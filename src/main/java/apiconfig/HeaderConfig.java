package apiconfig;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfig {
    public Map<String, String> defaultHeaders(){
        Map<String, String> defalut = new HashMap<String, String>();
        defalut.put("Connection", "keep-alive");
        defalut.put("User-Agent" ,"PostmanRuntime/7.29.0");
        defalut.put("accept", "application/json");


        return defalut;

    }
}
