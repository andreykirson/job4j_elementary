package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void WhenManHeight188() {
        double in = 188;
        double expected = 101.19;
        double actual = Fit.manWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void WhenWomanWeight160() {
        double in = 160;
        double expected = 57.49;
        double actual = Fit.womanWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }
}