package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenDistanceX10Y10X25Y25Then7dot071() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 5);
        double expected = 7.07;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceX10Y10X22Y20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceX10Y10X25Y29Then10dot29() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 9);
        double expected = 10.29;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceX10Y10X25Y29X30Y38Then13dot03() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(5, 9, 8);
        double expected = 13.03;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}