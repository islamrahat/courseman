package com.iiuc.courseman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String root()
    {
        return "Root Folder";
    }

    @GetMapping("/okay")
    public String okay() {
        return "Okay";
    }
}