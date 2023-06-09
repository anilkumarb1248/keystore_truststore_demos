package com.sb.https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HttpsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpsDemoApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		// Do any additional configuration here
//		return builder.build();
//	}

}
