package com.blaise2s.jenkins;

public class Course {
    private String courseTitle;
    private String courseDescription;
    private Professor professor;

    public Course(String courseTitle, String courseDescription, Professor professor) {
        super();
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.professor = professor;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
