package com.rayan.course.employee;

import java.util.Date;

/**
 * Created by saeed on 1/10/16.
 */
public abstract class Employee implements Payable, Comparable<Employee>{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double earnings();

    @Override
    public double getPaymentAmount() {
        return earnings();
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee";
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (earnings() - o.earnings());
    }
}