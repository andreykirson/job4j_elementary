package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {

    @Test
    public void check5() {
        boolean rsl = CheckPrimeNumber.check(6);
        assertThat(rsl, is(false));
    }
}