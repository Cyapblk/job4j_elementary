package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void check4() {
        assertFalse(CheckPrimeNumber.check(4));
    }

    @Test
    public void check5() {
        assertTrue(CheckPrimeNumber.check(5));
    }

    @Test
    public void check7() {
        assertTrue(CheckPrimeNumber.check(7));
    }

    @Test
    public void check1() {
        assertTrue(CheckPrimeNumber.check(1));
    }
}