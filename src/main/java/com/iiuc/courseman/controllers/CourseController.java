package com.iiuc.courseman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/")
    public String root() {
        return "Root Folder, type /{author} for roles";
    }

    @GetMapping("/sayed")
    public String syd()

    {
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

    @GetMapping("/animesh")
    public String ani() {
        return "Leader, Postman Tester";
    }
}