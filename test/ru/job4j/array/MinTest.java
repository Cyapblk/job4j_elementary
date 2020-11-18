package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void minFinder1() {
        int[] input = {3, 4, 1, 5};
        int expect = 1;
        assertThat(expect, is(Min.minFinder(input)));
    }

    @Test
    public void minFinder3() {
        int[] input = {6, 9, 10, 15, 6, 19, 3, 123, 777};
        int expect = 3;
        assertThat(expect, is(Min.minFinder(input)));
    }

    @Test
    public void minFinderMinus5() {
        int[] input = {6, 9, 3, -5, 6, 19, 3, 123, 777};
        int expect = -5;
        assertThat(expect, is(Min.minFinder(input)));
    }
}