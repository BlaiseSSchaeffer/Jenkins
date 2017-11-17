package com.blaise2s.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class CourseTest {
    private String courseTitle = "Intro to Computer Science";
    private String courseDescription = "A brief introduction to CS basics and essentials";
    private Professor professor = new Professor("firstName", "lastName", 1.23);
    private Course course = new Course(courseTitle, courseDescription, professor);

    @Test
    public void testCourseTitle() {
        Assert.assertTrue(courseTitle.equals(course.getCourseTitle()));
    }

    @Test
    public void testCourseDescription() {
        Assert.assertTrue(courseDescription.equals(course.getCourseDescription()));
    }

    @Test
    public void testProfessor() {
        Assert.assertTrue(professor.equals(course.getProfessor()));
    }
}
