package ru.netology.task5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekendScheduleTest {
    @Test
    public void example1() {
        WeekendSchedule service = new WeekendSchedule();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        WeekendSchedule service = new WeekendSchedule();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }

}




