package com.rayan.course.employee;

/**
 * Created by saeed on 2/8/16.
 */
public interface Payable {
    double getPaymentAmount();

    default double earnings() {
        return 7000000;
    }
}
