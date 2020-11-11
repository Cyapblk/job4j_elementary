package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void year4() {
        Assert.assertEquals(4, (Mortgage.year(100, 70, 50)));
    }

    @Test
    public void when1Year() {
        Assert.assertEquals(1, (Mortgage.year(1000, 1200, 1)));
    }

    @Test
    public void when2Year() {
        Assert.assertEquals(2, (Mortgage.year(100, 120, 50)));
    }
}