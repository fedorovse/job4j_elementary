package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2To4() {
        int[] input = {0, 1, 4, 7, 3, 8};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 1, 3, 7, 4, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4To5() {
        int[] input = {0, 1, 4, 7, 3, 8};
        int source = 4;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 1, 4, 7, 8, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0To0() {
        int[] input = {0, 1, 4, 7, 3, 8};
        int source = 0;
        int dest = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 1, 4, 7, 3, 8};
        Assert.assertArrayEquals(expected, result);
    }
}