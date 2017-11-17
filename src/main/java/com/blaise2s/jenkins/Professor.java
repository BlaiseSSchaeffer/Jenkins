package com.blaise2s.jenkins;

public class Professor extends Person {
    private Double salary;

    public Professor(String firstName, String lastName, Double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
