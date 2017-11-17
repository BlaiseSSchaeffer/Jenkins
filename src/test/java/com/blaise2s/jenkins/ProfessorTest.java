package com.blaise2s.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {
    private final String firstName = "Blaise";
    private final String lastName = "Schaeffer";
    private final Double salary = 123456.78;
    private Professor prof = new Professor(firstName, lastName, salary);

    @Test
    public void testFirstName() {
        Assert.assertTrue(firstName.equals(prof.getFirstName()));
    }

    @Test
    public void testLastName() {
        Assert.assertTrue(lastName.equals(prof.getLastName()));
    }

    @Test
    public void testSalary() {
        Assert.assertTrue(salary.equals(prof.getSalary()));
    }
}
