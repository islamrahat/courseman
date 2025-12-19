package com.iiuc.courseman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String root() {
        return "Root Folder, type /{author} for roles";
    }

    @GetMapping("/animesh")
    public String ani() {
        return "Model Layer";
    }

    @GetMapping("/sami")
    public String smi() {
        return "Service Layer";
    }

    @GetMapping("/rahat")
    public String rht() {
        return "Controller Layer";
    }

    @GetMapping("/sayed")
    public String syd() {
        return "Leader, Postman Tester";
    }
}