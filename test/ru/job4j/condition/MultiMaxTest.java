package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void when1max() {
        int result = MultiMax.max (2,1,1);
        assertThat(result, is(2));
    }


    @Test
    public void when2max() {
        int result = MultiMax.max(1,2,1);
        assertThat(result, is(2));
    }

    @Test
    public void when3max() {
        int result = MultiMax.max(1,1,3);
        assertThat(result, is(3));
    }

    @Test
    public void allTheSame() {
        int result = MultiMax.max(1,1,1);
        assertThat(result, is(1));
    }
}