package com.example.demo.chap3.gener.excersise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/get")
    public Response<User> userResponse() {
        User user = new User("1", 2);
        return new Response<>("success", "tot", user);
    }
}
