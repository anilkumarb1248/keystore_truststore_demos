package com.client.demo.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class ServerClient {

    private final RestTemplate restTemplate;

    @Autowired
    public ServerClient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public String getDataFromServer(){
//        String serverURL = "http://localhost:2000/server/data";
        String serverURL = "https://localhost:2000/server/data";
        try{
            return restTemplate.getForObject(serverURL, String.class);
        }catch (RestClientException e){
            System.err.println(e.getMessage());
            return "Failed to connect server, message: "+ e.getMessage();
        }
    }
}
