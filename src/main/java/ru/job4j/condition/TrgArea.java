package ru.job4j.condition;

public class TrgArea {
    public static float area(float a, float b, float c) {
        float p = (float) (0.5 * (a + b + c));
        float rsl = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        float rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
