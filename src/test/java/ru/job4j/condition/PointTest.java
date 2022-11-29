package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenDistanceX10Y10X25Y25Then7dot071() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        double expected = 7.07;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceX10Y10X22Y20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceX10Y10X25Y29Then10dot29() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 9;
        double expected = 10.29;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}