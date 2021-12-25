package com.maveric.poc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("/welcome")
    String welcomeUser() {
        int sonarlintbugCheckUnusedvar = 10;
        System.out.println("Sonarlint bug check sys.out.");
        return "Hello World - v3!";
    }
}
