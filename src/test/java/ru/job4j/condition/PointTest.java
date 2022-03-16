package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to50then4() {
        double expected = 4;
        int x1 = 1;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to26then4() {
        double expected = 4;
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 6;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}