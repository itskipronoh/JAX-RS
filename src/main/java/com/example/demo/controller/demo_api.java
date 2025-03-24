package com.example.demo.controller;


import com.example.demo.model.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")

public class demo_api
{
    @GetMapping("/{demoId}")
    public demo getDemoDetails(String demoId) {
        // Create and return a demo object with the provided ID
        return new demo(demoId, "Sample Name", "Sample Address", "123-4567");
    }


}
