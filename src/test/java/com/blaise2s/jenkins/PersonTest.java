package com.blaise2s.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    private final String firstName = "Blaise";
    private final String lastName = "Schaeffer";
    private Person person = new Person(firstName, lastName);

    @Test
    public void testFirstName() {
        Assert.assertTrue(firstName.equals(person.getFirstName()));
    }

    @Test
    public void testLastName() {
        Assert.assertTrue(lastName.equals(person.getLastName()));
    }

}
