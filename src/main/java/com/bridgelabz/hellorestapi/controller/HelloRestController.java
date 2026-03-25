package com.bridgelabz.hellorestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.hellorestapi.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HelloRestController {

    // UC1
    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    // UC2
    @GetMapping("/hello/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3
    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/hello/post")
    public String helloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/hello/put/{firstName}")
    public String helloPut(@PathVariable String firstName,
                           @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}