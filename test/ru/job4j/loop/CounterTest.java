package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void sumFrom1To10() {
       int rsl = Counter.sum(1,10);
       assertThat(rsl, is(55));
    }

    @Test
    public void sumByEvenFrom1To10() {
        int rsl = Counter.sumByEven(1,10);
        assertThat(rsl, is(30));
    }
}