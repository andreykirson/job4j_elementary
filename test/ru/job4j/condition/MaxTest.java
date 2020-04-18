package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
            int result = Max.maxMultiple(1, 2);
            assertThat(result, is(2));
        }
    @Test
    public void whenMax2To1Then1() {
        int result = Max.maxMultiple(3,1);
        assertThat(result, is(3));
    }

    @Test
    public void when1Equal2ThenAny() {
        int result = Max.maxMultiple(4,4);
        assertThat(result, is(4));
    }

    @Test
    public void whenForth() {
    int result = Max.maxMultiple(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenThree() {
        int result = Max.maxMultiple(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void AllFourTheSame() {
        int result = Max.maxMultiple(4, 4, 4, 4);
        assertThat(result, is(4));
    }
}
