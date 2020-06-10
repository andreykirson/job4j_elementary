package ru.job4j.calculator;

public class Calculator2 {
    public static void pius (int one, int two) {
        int result = one + two;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Calculator2.pius(100, 500);
        Calculator2.pius(4, 2);
        Calculator2.pius(3, 5);
    }
}
