package com.blaise2s.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    private final String firstName = "Blaise";
    private final String lastName = "Schaeffer";
    private final Integer id = 332085;
    private final Integer grade = 12;
    private final Double accountBalance = 103.56;
    private Student student = new Student(firstName, lastName, id, grade, accountBalance);

    @Test
    public void testFirstName() {
        Assert.assertTrue(firstName.equals(student.getFirstName()));
    }

    @Test
    public void testLastName() {
        Assert.assertTrue(lastName.equals(student.getLastName()));
    }

    @Test
    public void testId() {
        Assert.assertTrue(id.equals(student.getId()));
    }

    @Test
    public void testGrade() {
        Assert.assertTrue(grade.equals(student.getGrade()));
    }

    @Test
    public void testAccountBalance() {
        Assert.assertTrue(accountBalance.equals(student.getAccountBalance()));
    }

}
