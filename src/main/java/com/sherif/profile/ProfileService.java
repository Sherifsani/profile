package com.sherif.profile;

import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

@Service
public class ProfileService {

    public String getFact(){
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://catfact.ninja/fact"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject json = new JSONObject(response.body());
            return json.getString("fact");
        } catch (Exception e) {
            return "an error occurred when fetching cat fact but do you know cats don't actually have 9 lives";
        }
    }

    public ProfileResponse getProfile(){
        Profile myProfile = new Profile("sanisherif838@gmail.com", "Sherif Sani", "java/springboot");
        String fact = getFact();
        return new ProfileResponse("success", myProfile, LocalDateTime.now(), fact);
    }
}
