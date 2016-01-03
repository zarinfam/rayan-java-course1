package com.rayan.course;


import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by saeed on 12/20/15.
 */
public class Time1Test {

    @Test(expected=IllegalArgumentException.class)
    public void setTime_setWrongTimeDate_throwIllegalArgumentException() {
        Time1 time1 = new Time1();

        time1.setTime(25, 1, 1);

        time1.setTime(1, 61, 1);

        time1.setTime(1, 1, 65);

    }

    @Test
    public void setTime_setCorrectTimeDate_setupCorrectObject() {
        Time1 time1 = new Time1();

        time1.setTime(11, 1, 1);

        assertThat(time1.getTimeString()).isEqualTo("11:01:01");
    }
}