package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3and4and5Then5() {
        int first = 3;
        int second = 4;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax4and4and4Then4() {
        int first = 4;
        int second = 4;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax9and4and5Then9() {
        int first = 9;
        int second = 4;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2and3and4and5Then5() {
        int first = 2;
        int second = 3;
        int third = 4;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }
}