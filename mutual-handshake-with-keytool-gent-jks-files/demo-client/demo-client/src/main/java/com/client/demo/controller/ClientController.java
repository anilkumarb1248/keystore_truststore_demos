package com.client.demo.controller;

import com.client.demo.clients.ServerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ServerClient serverClient;

    @Autowired
    public ClientController(ServerClient serverClient){
        this.serverClient = serverClient;
    }

    @GetMapping("/data")
    public String getData(){
        String clientData = "Response from the client";
        String serverData = serverClient.getDataFromServer();
        return "Client Data: " + clientData + ", /n Server Data: " + serverData;
    }
}
