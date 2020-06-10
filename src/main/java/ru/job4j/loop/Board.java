package ru.job4j.loop;

/**
 *
 * условие проверки, что писать пробел или X
 * Выше в задании мы определили закономерность, когда нужно проставлять X
 */
public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j <= height; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(5, 5);
        System.out.println();
        paint(8, 8);
    }
}
