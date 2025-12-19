package com.iiuc.courseman.models;

public class Course {
    private Long id;              // unique ID (manually handled)
    private String code;           // e.g., CSE-2340
    private String title;          // e.g., Software Development-1
    private double credit;         // e.g., 2.0
    private String type;           // e.g., Lab / Theory
    private String semester;       // e.g., Autumn 2025
    private Long departmentId;     // relationship via ID
    private String teacher;        // e.g., MAS

    // Default Constructor
    public Course() {
    }

    // Parameterized Constructor
    public Course(Long id, String code, String title, double credit,
                  String type, String semester, Long departmentId, String teacher) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.credit = credit;
        this.type = type;
        this.semester = semester;
        this.departmentId = departmentId;
        this.teacher = teacher;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
}
