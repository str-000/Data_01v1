package com.company;

public class Date {
    public Date(int day, int month, int year) {
        int numberOfDays;

        if (year % 4 == 0) {
            numberOfDays = 366;
        } else numberOfDays = 365;

        if (day > 31 || month > 12) {
            System.out.println("Niepoprawna data!");
        } else {
            System.out.println( " \nDzień: " + day +
                                " \nMiesiąc: " + month +
                                " \nRok: " + year +
                                " ( " + numberOfDays + " ) ");
        }
    }
}
