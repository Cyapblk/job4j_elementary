package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenFind3() {
        int[] input = {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int expect = 3;
        int result = FindLoop.index0f(input, value, start, finish);
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind4() {
        int[] input = {5, 2, 10, 2, 4};
        int value = 4;
        int start = 1;
        int finish = 4;
        int expect = 4;
        int result = FindLoop.index0f(input, value, start, finish);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind4() {
        int[] input = {5, 2, 10, 2, 4};
        int value = 4;
        int start = 1;
        int finish = 3;
        int expect = -1;
        int result = FindLoop.index0f(input, value, start, finish);
        assertThat(result, is(expect));
    }
}