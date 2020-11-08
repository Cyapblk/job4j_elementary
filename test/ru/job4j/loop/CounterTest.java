package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void when1to5sumByEven30() {
        Assert.assertEquals((Counter.sum(0, 5)), 15);
    }

    @Test
    public void when1to10sumByEven30() {
        Assert.assertEquals((Counter.sumByEven(1, 10)), 30);
    }

    @Test
    public void when1to1sumByEventhen0() {
        Assert.assertEquals((Counter.sumByEven(1, 1)), 0);
    }

    @Test
    public void when4to4sumByEven44() {
        Assert.assertEquals((Counter.sumByEven(4, 4)), 4);
    }

    @Test
    public void when2to2sumByEven2() {
        Assert.assertEquals((Counter.sumByEven(2, 2)), 2);
    }

    @Test
    public void whenminus1to1sumByEven0() {
        Assert.assertEquals((Counter.sumByEven(-1, 1)), 0);
    }

    @Test
    public void whenminus6tominus4sumByEvenMinus10() {
        Assert.assertEquals((Counter.sumByEven(-6, -4)), -10);
    }

    @Test
    public void whenminus10to0ByEvenMinus30() {
        Assert.assertEquals((Counter.sumByEven(-10, 0)), -30);
    }

    @Test
    public void whenminus4to0sumByEvenMinus6() {
        Assert.assertEquals((Counter.sumByEven(-4, 0)), -6);
    }

    @Test
    public void when3to13sumByEven40() {
        Assert.assertEquals((Counter.sumByEven(3, 13)), 40);
    }
}