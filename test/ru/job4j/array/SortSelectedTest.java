package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void sort() {
        int[] input = {5, 3, 4, 1, 2};
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(expected, is(SortSelected.sort(input)));
    }

    @Test
    public void sort2() {
        int[] input = {5, -3, -4, 1, 2};
        int[] expected = {-4, -3, 1, 2, 5};
        assertThat(expected, is(SortSelected.sort(input)));
    }

    @Test
    public void sort3() {
        int[] input = {5, 6, 7, 6, 5};
        int[] expected = {5, 5, 6, 6, 7};
        assertThat(expected, is(SortSelected.sort(input)));
    }
}