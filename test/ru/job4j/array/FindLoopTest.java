package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 3;
        int expect = 2;
        int result = FindLoop.index0f(input, value);
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas10Then4() {
        int[] input = {3, 7, 3, 2, 10, 7, 100500, 7, 8};
        int value = 10;
        int result = FindLoop.index0f(input, value);
        assertThat(result, is(4));
    }

    @Test
    public void whenArrayNo13ThenFail() {
        int[] input = {3, 7, 3, 2, 10, 7, 100500, 7, 8};
        int value = 13;
        int expect = -1;
        int result = FindLoop.index0f(input, value);
        assertThat(result, is(expect));
    }
}