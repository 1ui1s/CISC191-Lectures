package edu.sdccd.cisc191;

import java.util.Random;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static Day getRandomDay() {
        return Day.values()[new Random().nextInt(Day.values().length)];
    }
}

