package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Assert.assertEquals((Factorial.calc(5)), 120);
    }

    @Test
    public void when1calc() {
        Assert.assertEquals((Factorial.calc(1)), 1);
    }
}