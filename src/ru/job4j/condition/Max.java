package ru.job4j.condition;

public class Max {
    public static int maxMultiple(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int maxMultiple(int first, int second, int third) {
        return maxMultiple(first,
                maxMultiple(second, third));
    }

    public static int maxMultiple(int first, int second, int third, int fourth) {
    return maxMultiple(first,
            maxMultiple(second, third),
            maxMultiple(third, fourth));
    }

}


