package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void sumZero() {
        int[][] input = {
                {1, 2, 1},
                {1, 2, 333},
                {11, 12, -363}
        };
        Assert.assertEquals(MatrixSum.sum(input), 0);
        }

    @Test
    public void sumZeroagain() {
        int[][] input = {
                {-777, -1, -2},
                {-3, -4, 4},
                {3, 3, 777},
                {0, 0, 0, 0}
        };
        Assert.assertEquals(MatrixSum.sum(input), 0);
    }
}
