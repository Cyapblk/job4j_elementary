package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        Assert.assertTrue(EndsWith.endWith(word, post));
    }

    @Test
    public void whenStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'K', 'o'};
        Assert.assertFalse(EndsWith.endWith(word, post));
    }

    @Test
    public void whenStartWithPrefixBalaThenTrue2() {
        char[] word = {'B', 'a', 'l', 'a', 'k', 'l', 'a', 'v', 'a'};
        char[] post = {'a', 'l', 'a', 'k', 'l', 'a', 'v', 'a'};
        Assert.assertTrue(EndsWith.endWith(word, post));
    }
}