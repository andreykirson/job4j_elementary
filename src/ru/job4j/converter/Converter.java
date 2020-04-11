package ru.job4j.converter;

/**
 * Convert currency USD to RUB, EURO to RUB
 * @author Andrey
 */

public class Converter {
    /**
     * @param value
     * @return ERUO
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * @param value
     * @return USD
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллaры.
        return rsl;
    }

    /**
       * @param args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int usd = Converter.rubleToDollar(50);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("50 rubles are " + usd + " usd.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 ERUO. Test result : " + passed);
        in = 120;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2 USD. Test result : " + passed);

    }


}
