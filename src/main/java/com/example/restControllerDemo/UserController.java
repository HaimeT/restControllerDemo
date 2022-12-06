package com.example.restControllerDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")

public class UserController {


    private User user = new User("Haime");

    @GetMapping
    public String findName() {
        return user.getName();
    }
}


