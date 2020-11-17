package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenOnlyTrue() {
        boolean[] input = {true, true, true, true};
        boolean expect = true;
        boolean result = Check.mono(input);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenVarious() {
        boolean[] input = {true, true, true, false};
        boolean expect = false;
        boolean result = Check.mono(input);
        Assert.assertEquals(expect, result);
        }

    @Test
    public void whenOnlyfalse() {
        boolean[] input = {false, false, false, false, false, false};
        boolean expect = true;
        boolean result = Check.mono(input);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenVarious2() {
        boolean[] input = {false, true, true, true, true, true};
        boolean expect = false;
        boolean result = Check.mono(input);
        Assert.assertEquals(expect, result);
    }
}