package com.example.ms1.controller;

import com.example.ms1.service.MS1Service;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms1")
public class MS1Controller {

    private final MS1Service ms1Service;

    public MS1Controller(MS1Service ms1Service) {
        this.ms1Service = ms1Service;
    }

    @GetMapping(value = "/add", produces = MediaType.TEXT_PLAIN_VALUE)
    public String add(@RequestParam int a, @RequestParam int b) {
        return "MS 1.1 - Additon = " + ms1Service.add(a, b);
    }
}
