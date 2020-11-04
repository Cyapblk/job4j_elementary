package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void when142max() {
        int exp = 4;
        int out = MultiMax.max(1, 4, 2);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void when421max() {
        int exp = 4;
        int out = MultiMax.max(4, 2, 1);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void when124max() {
        int exp = 4;
        int out = MultiMax.max(1, 2, 4);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void when666max() {
        int exp = 6;
        int out = MultiMax.max(6, 6, 6);
        Assert.assertEquals(exp, out);
    }
}