package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when12maxThen() {
        int left = 1;
        int right = 2;
        int exp = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void when63maxThen() {
        int left = 6;
        int right = 3;
        int exp = 6;
        int out = Max.max(left, right);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void when77maxThen() {
        int left = 7;
        int right = 7;
        int exp = 7;
        int out = Max.max(left, right);
        Assert.assertEquals(exp, out);
    }
}





