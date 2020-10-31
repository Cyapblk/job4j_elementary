package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2squareThen2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP95K33squareThen402() {
        float p = 9.5F;
        float k = 3.3F;
        double expected = 4.02;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP135K45squareThen677() {
        float p = 13.5F;
        float k = 4.5F;
        double expected = 6.77;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}