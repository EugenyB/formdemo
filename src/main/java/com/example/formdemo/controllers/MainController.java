package com.example.formdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @PostMapping("/login")
    public String login(@RequestParam String user, @RequestParam String pwd) {
        if ("eugeny".equals(user) && "secret".equals(pwd)) {
            return "login_success";
        }
        return "login_failed";
    }
}
