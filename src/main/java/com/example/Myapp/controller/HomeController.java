package com.example.Myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String home() {
        System.out.println("Inside HomeController");
        return "Hello World";
    }

    @RequestMapping("/about")
    public String home1() {
        System.out.println("Inside Home");
        return "Hello u are in About page";
    }
}
