
package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void tExist() {
        Point first = new Point(1,1);
        Point second = new Point(3,5);
        Point third = new Point(4,1);
        Triangle testTriangle = new Triangle(first, second, third);
        boolean result = Triangle.exist(testTriangle.a, testTriangle.b, testTriangle.c);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        Point first = new Point(1,10);
        Point second = new Point(10,1);
        Point third = new Point(10,1);
        Triangle testTriangle = new Triangle(first, second, third);
        boolean result = Triangle.exist(testTriangle.a, testTriangle.b, testTriangle.c); // Почему  java хочет сделать метод exist, т.к если не сделать то выдаёт ошибку Error non-static method exist(double,double,double) cannot be referenced from a static context
        assertThat(result, is(false));
    }


    @Test
    public void period() {
        Point first = new Point(1,1);
        Point second = new Point(3,5);
        Point third = new Point(4,1);
        Triangle testTriangle = new Triangle(first, second, third);
        double rsl = testTriangle.period(testTriangle.a, testTriangle.b, testTriangle.c);
        double expected = 5.79;
        Assert.assertEquals(expected, rsl,  0.01);
    }


    @Test
    public void area() {
        Point first = new Point(1,10);
        Point second = new Point(2,5);
        Point third = new Point(4,20);
        Triangle testTriangle = new Triangle(first, second, third);
        double expected = 12.49;
        double rsl = testTriangle.area(); // как все необходимые параметры попали в метод area я ведь не передавал туда в явном виде ничего?
        Assert.assertEquals(expected, rsl,  0.01);
    }
}
