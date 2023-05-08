package com.server.demo.controller;

import com.server.demo.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {

    @GetMapping("/data")
    public String getData(){
        return "Returning data in secure way from server";
    }

    @PostMapping("/data")
    public String addData(@RequestBody Student student){
        return "Adding Student with id: " + student.getId() + ", name: " + student.getName() + " in server";
    }
}
