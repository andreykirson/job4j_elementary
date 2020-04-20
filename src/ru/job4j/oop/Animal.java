package ru.job4j.oop;

public class Animal {
    public Animal() {
        super();
        System.out.println("Animal");
    }
    public Animal(String name) {
    }

    public class Predator extends Animal {
        public Predator(String name) {
            super(name);
            System.out.println("Predator");
        }
    }

    public class Tiger extends Predator {
        public Tiger(String name) {
            super(name);
            System.out.println("Tiger");
        }
    }

}
