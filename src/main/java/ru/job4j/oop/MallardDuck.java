package ru.job4j.oop;

public class MallardDuck extends Duck {


    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }

    @Override
    public void performQuack() {
        System.out.println("Krya Krya");
    }
}