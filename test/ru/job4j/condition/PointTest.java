package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void distance() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double in = a.distance(b);
        Assert.assertEquals(expected, in,  0.01);
    }

    @Test
    public void distance3D() {

        double expected = 6.92;
        Point a3D = new Point(1, 1, 1);
        Point b3D = new Point(5, 5, 5);
        double in = a3D.distance3D(b3D);
        Assert.assertEquals(expected, in,  0.01);
    }
}