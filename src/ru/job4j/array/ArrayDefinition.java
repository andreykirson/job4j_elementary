package ru.job4j.array;

public class ArrayDefinition {
    public static void main() {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Andrey";
        names[1] = "Igor";
        names[0] = "Ivan";
        names[0] = "Sasha";
        names[0] = "Aleksey";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
    }
}
