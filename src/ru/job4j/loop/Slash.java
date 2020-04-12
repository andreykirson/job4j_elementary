package ru.job4j.loop;

public class Slash {
    public static void draw(int size){
        for (int row = 0; row <= size; row++) {
            for(int col = 0; col <= size; col++){
             if (row + col == size || col == row){
                    System.out.print("0");
                } else {System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw by 8");
        draw(20);
    }

}
