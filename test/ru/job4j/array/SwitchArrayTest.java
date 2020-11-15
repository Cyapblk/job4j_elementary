package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap6to8() {
        int[] input = {1, 2, 3, 4, 6, 8, 666, 777, 13, 31};
        int[] expect = {1, 2, 3, 4, 6, 8, 13, 777, 666, 31};
        int[] rsl = SwitchArray.swap(input, 6, 8);
        assertThat(rsl, is(expect));
    }










}