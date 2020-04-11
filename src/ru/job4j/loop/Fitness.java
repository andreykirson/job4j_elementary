package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (3 * ivan * (month == 0 ? 1 : month) < 2 * nik) {
            month = month + 1;
        }
        return month;
    }
}
