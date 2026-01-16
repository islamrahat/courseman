package com.iiuc.courseman.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiuc.courseman.models.CourseModels;
import com.iiuc.courseman.services.CourseServices;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseServices courseServices;

    public CourseController(CourseServices courseServices)
    {
        this.courseServices = courseServices;
    }

    @GetMapping
    public List<CourseModels> getAllCourses()
    {
        return courseServices.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseModels getById(@PathVariable Long id)
    {
        return courseServices.getCourseById(id);
    }

    @PostMapping
    public CourseModels addCourse(@RequestBody CourseModels course)
    {
        return courseServices.addCourse(course);
    }

    @PutMapping("/{id}")
    public CourseModels update(@PathVariable Long id, @RequestBody CourseModels course)
    {
        return courseServices.update(id,course);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id)
    {
        if(courseServices.deleteCourse(id) == true) {return "Deleted Succesfully!";}
        return "Course details not found.";
    }
}