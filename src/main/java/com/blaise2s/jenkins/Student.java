package com.blaise2s.jenkins;

public class Student extends Person {
    private Integer id;
    private Integer grade;
    private Double accountBalance;

    public Student(String firstName, String lastName, Integer id, Integer grade, Double accountBalance) {
        super(firstName, lastName);
        this.id = id;
        this.grade = grade;
        this.accountBalance = accountBalance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

}
