package com.company;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear (int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            daysInMonth = -1;
        } else {
            boolean leapYear = isLeapYear(year);
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 2:
                    if (leapYear) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth =28;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
            }
        }
        return daysInMonth;
    }
}
