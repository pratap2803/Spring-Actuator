package com.SpringActuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {
    @GetMapping("/get-data")
    public Map<String, String> getData(){
        return Map.of("Name", "Durgesh Tiwari");
    }
}
