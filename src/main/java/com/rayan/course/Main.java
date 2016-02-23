package com.rayan.course;

import com.rayan.course.employee.BasePlusCommissionEmployee;
import com.rayan.course.employee.CommissionEmployee;
import com.rayan.course.employee.Employee;

import java.util.Scanner;

/**
 * Created by saeed on 12/13/15.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Ali", "Ahmadi", "111111111", 200000, 0.1
        );


        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Ali", "Mohammadi", "111111111", 200000, 0.1, 1000000
        );

        BasePlusCommissionEmployee basePlusCommissionEmployee1 = new BasePlusCommissionEmployee(
                "Ali", "Javadi", "111111111", 200000, 0.1, 7009000
        );


        Employee employee = maximum(commissionEmployee, basePlusCommissionEmployee, basePlusCommissionEmployee1);

        System.out.println(employee.getLastName());

    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x; // assume x is initially the largest
        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far
        if (z.compareTo(max) > 0)
            max = z; // z is the largest
        return max; // returns the largest object
    }

}
