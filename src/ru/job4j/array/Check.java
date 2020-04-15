package ru.job4j.array;

public class Check {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (result != data[i]) {
                result = false;
             break;
            }
        }
        return result;
    }
}
