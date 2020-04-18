package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Fox fox = new Fox();

        ball.runaway(hare, wolf);
        fox.eat(ball);
        wolf.take(ball);
        hare.take(ball);
    }
}

