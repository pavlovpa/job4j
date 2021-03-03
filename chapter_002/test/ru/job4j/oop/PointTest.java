package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void distanceTest() {
        Point a = new Point(0, 10);
        Point b = new Point(0, 0);
        double rsl = b.distance(a);
        assertThat(rsl, closeTo(10, 0.001));
    }

    @Test
    public void distance3DTest() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 0, 0);
        double rsl = b.distance3d(a);
        assertThat(rsl, closeTo(4, 0.001));
    }
}
