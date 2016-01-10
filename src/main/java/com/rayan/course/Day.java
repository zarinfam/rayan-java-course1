package com.rayan.course;

/**
 * Created by saeed on 1/10/16.
 */
public enum Day {
    MONDAY("دوشنبه", false), FRIDAY("جمعه", true);

    private String name;
    private boolean holiday;

    Day(String name, boolean holiday) {
        this.name = name;
        this.holiday = holiday;
    }

    public String getName() {
        return name;
    }


    public boolean isHoliday() {
        return holiday;
    }
}
