package com.rayan.course;


import com.rayan.course.employee.BasePlusCommissionEmployee;
import com.rayan.course.employee.CommissionEmployee;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by saeed on 12/20/15.
 */
public class Test {

    @org.junit.Test
    public void getHelloMessage_gettingMessage_returnHelloMessage() {

        List<CommissionEmployee> employees = new ArrayList<CommissionEmployee>();

        employees.add(new BasePlusCommissionEmployee(
                        "Ali", "Ahmadi", "111111111", 200000, 0.1, 1000000
                )
        );

        employees.add(new CommissionEmployee(
                "Naghi", "Ahmadi", "111111111", 100000, 0.2
        ));

        for (CommissionEmployee employee : employees) {

//            assertThat(employee.earnings()).isEqualTo(1020000);
            if (employee instanceof BasePlusCommissionEmployee) {
                assertThat(((BasePlusCommissionEmployee) employee).getBaseSalary()).isEqualTo(1020000);
            }

        }

    }

    @org.junit.Test
    public void test() {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Ali", "Ahmadi", "111111111", 200000, 0.1
        );

        System.out.println(commissionEmployee);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Ali", "Ahmadi", "111111111", 200000, 0.1, 1000000
        );

        System.out.println(basePlusCommissionEmployee);

        commissionEmployee = basePlusCommissionEmployee;

        System.out.println(commissionEmployee);
    }
}
