package com.sb.https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {

    private final RestTemplate restTemplate;

    public TestController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    @GetMapping("/data")
    public String getData() {
        return "Working with HTTPS";
    }
    
    @GetMapping("/json")
    public String getDummyJson(){
        String url = "https://dummyjson.com/products/1";
        String json = restTemplate.getForObject(url, String.class);
        System.out.println(json);
        return json;
    }
}



