package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        int buff = 0;
        for (int i = 1; i <= n; i++) {
            if (n == 0 || n == 1) {
                result = 1;
            }
            result = result * i;
        }
        return result;
    }
}
