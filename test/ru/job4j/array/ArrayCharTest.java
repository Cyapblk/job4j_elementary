package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
            char[] word = {'H', 'e', 'l', 'l', 'o'};
            char[] pref = {'H', 'e'};
            boolean exp = true;
            Assert.assertEquals(exp, ArrayChar.startsWith(word, pref));
    }

    @Test
    public void whenStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean exp = false;
        Assert.assertEquals(exp, ArrayChar.startsWith(word, pref));
    }

    @Test
    public void whenStartWithPrefixBalaThenTrue() {
        char[] word = {'B', 'a', 'l', 'a', 'k', 'l', 'a', 'v', 'a'};
        char[] pref = {'a', 'l', 'a', 'k', 'l', 'a', 'v'};
        boolean exp = false;
        Assert.assertEquals(exp, ArrayChar.startsWith(word, pref));
    }
}