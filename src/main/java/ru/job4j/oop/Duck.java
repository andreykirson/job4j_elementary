package ru.job4j.oop;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {

        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {

        quackBehavior = qb;
    }

    public void display() {

    }

    public void performFly() {

        flyBehavior.fly();
    }

    public void performQuack() {

        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}

