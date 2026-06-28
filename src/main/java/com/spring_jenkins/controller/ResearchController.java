package com.spring_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/research")
public class ResearchController {

    @GetMapping("/test")
    public String test() {
        return "Research Controller is working!";
    }
}
