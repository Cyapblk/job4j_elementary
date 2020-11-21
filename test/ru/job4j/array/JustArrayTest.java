package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JustArrayTest {

    @Test
    public void whole() {
        int[] input = {1, 2, 3, 4};
        Assert.assertEquals(10, JustArray.whole(input));
    }
}