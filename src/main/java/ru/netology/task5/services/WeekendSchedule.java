package ru.netology.task5.services;

public class WeekendSchedule {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (income - expenses) - ((income - expenses) / 3);
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
