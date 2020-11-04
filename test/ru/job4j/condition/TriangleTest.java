package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void when222existthentrue() {
        boolean exp = true;
        boolean in = Triangle.exist(2.0, 2.0, 2.0);
        Assert.assertEquals(in, exp);
    }

    @Test
    public void when123existthentrue() {
        boolean exp = true;
        boolean in = Triangle.exist(1.0, 2.0, 3.0);
        Assert.assertEquals(in, exp);
    }

    @Test
    public void when345existthentrue() {
        boolean exp = true;
        boolean in = Triangle.exist(3.0, 4.0, 5.0);
        Assert.assertEquals(in, exp);
    }
}