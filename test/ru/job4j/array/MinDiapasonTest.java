package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat( MinDiapason.findMin(new int[] {-1, 0, 5, 10},1, 3 ),is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(MinDiapason.findMin(new int[] {2, 4, 6, 8, 9, 7, 1}, 0, 6), is(1));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(MinDiapason.findMin(new int[] {10, 2, 5, 1}, 0, 2), is(2));
    }
}