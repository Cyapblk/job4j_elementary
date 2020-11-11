package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5() {
        Assert.assertEquals(3, PrimeNumber.qty(5));
    }

    @Test
    public void when2() {
        Assert.assertEquals(1, PrimeNumber.qty(2));
    }

    @Test
    public void when10() {
        Assert.assertEquals(4, PrimeNumber.qty(10));
    }

    @Test
    public void when13() {
    Assert.assertEquals(6, PrimeNumber.qty(13));
    }

    @Test
    public void when7() {
        Assert.assertEquals(4, PrimeNumber.qty(9));
    }

    @Test
    public void when998() {
            Assert.assertEquals(168, PrimeNumber.qty(998));
    }
}