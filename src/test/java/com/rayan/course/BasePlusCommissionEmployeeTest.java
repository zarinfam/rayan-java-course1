package com.rayan.course;

import com.rayan.course.employee.BasePlusCommissionEmployee;
import com.rayan.course.employee.CommissionEmployee;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by saeed on 2/2/16.
 */
public class BasePlusCommissionEmployeeTest {

    @Test
    public void testEarning_CommissionEmployee_Success() {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Ali", "Ahmadi", "111111111", 200000, 0.2, 5000
        );

        assertThat(employee.getGrossSales()).isEqualTo(200000);
        assertThat(employee.earnings()).isEqualTo(45000);

    }

}
