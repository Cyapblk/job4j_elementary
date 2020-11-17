package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void tailCheck() {
        int[] right = {1, 2, 3, 7};
        int[] left = {13, 31, 27, 567, 67, 33, 7};
        Assert.assertTrue(EqLast.tailCheck(right, left));
    }

    @Test
    public void tailCheckFalse() {
        int[] right = {1, 2, 3, 999};
        int[] left = {13, 31, 27, 567, 67, 33, 7};
        Assert.assertFalse(EqLast.tailCheck(right, left));
    }
}