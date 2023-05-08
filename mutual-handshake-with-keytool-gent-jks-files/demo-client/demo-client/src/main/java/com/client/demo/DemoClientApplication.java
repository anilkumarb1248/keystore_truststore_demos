package com.client.demo;

import com.client.demo.controller.ClientController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoClientApplication implements ApplicationRunner {

	@Autowired
	ClientController clientController;

	public static void main(String[] args) {
		SpringApplication.run(DemoClientApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String s = clientController.getData();
		System.out.println(s);
	}
}
