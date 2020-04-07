package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void WhenManHeight188() {
        double in = 188;
        double expected = 101.19999999999999;
        double actual = Fit.manWeight(in);
        double delta = actual - expected;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void WhenWomanWeight160() {
        double in = 160;
        double expected = 57.49999999999999;
        double actual = Fit.womanWeight(in);
        double delta = actual - expected;
        Assert.assertEquals(expected, actual, delta);
    }
}