package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void minFinderInRange0() {
        int[] input = {-1, 0, 5, 10, -17, 3, -150};
        Assert.assertEquals(-150, MinDiapason.minFinderInRange(input, 1, 6));
    }
}