package ru.job4j.oop;

public class Animal {
    public Animal() {
        super();
        System.out.println("Animal");
    }

    public class Predator extends Animal {
        public Predator() {
            super();
            System.out.println("Predator");
        }
    }

    public class Tiger extends Predator {
        public Tiger() {
            super();
            System.out.println("Tiger");
        }
    }

}
