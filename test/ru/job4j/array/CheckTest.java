package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}