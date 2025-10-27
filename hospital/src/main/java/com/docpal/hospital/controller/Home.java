package com.docpal.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Home {
    @GetMapping ("/homeController")
    public String homeController() {
         return "Hello World.This is the home page of Hospital";
    }
}
