package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(6, 1, 3);
        assertThat(result, is(6));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(8, 20, 67);
        assertThat(result, is(67));
    }

    @Test
    public void wheNumbersAreEqual() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}
