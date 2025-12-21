package com.iiuc.courseman.services;
import java.util.*;
import org.springframework.stereotype.Service;
import com.iiuc.courseman.models.CourseModels;

@Service
public class CourseServices {
    private List<CourseModels> courses = new ArrayList<>();
    private Long nextId = 100L;

    /// add() function
    public CourseModels addCourse(CourseModels course) {
        course.setId(nextId);
        nextId++;
        courses.add(course);
        return course;
    }

    /// getAll() function
    public List<CourseModels> getAllCourses() {
        return courses;
    }

    /// getById(Long id) 
    public CourseModels getCourseById(Long Id) {
        for(CourseModels x : courses){
            if(x.getId().equals(Id)){
                return x;
            }
        }
        return null;
    }


    /// Updating all information by specific ID
    public CourseModels update(Long Id, CourseModels course) {
            for(CourseModels x : courses){
                if(x.getId().equals(Id)){
                    x.setCode(course.getCode());
                    x.setTitle(course.getTitle());
                    x.setCredit(course.getCredit());
                    x.setType(course.getType());
                    x.setSemester(course.getSemester());
                    x.setDepartmentId(course.getDepartmentId());
                    x.setTeacher(course.getTeacher());
                    return x;
                }
            }
            return null;
    }


    /// deleting courses by specific Id
    public boolean deleteCourse(Long Id) {
        for(int i = 0; i<courses.size(); i++){
            if(courses.get(i).getId().equals(Id)){
                courses.remove(i);
                return true;
            }
        }
        return false;
    }

    

}
