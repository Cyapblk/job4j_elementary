package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void merge() {
        int[] left = {1, 3, 6, 9};
        int[] right = {4, 7, 13, 17, 18};
        int[] expt = {1, 3, 4, 6, 7, 9, 13, 17, 18};
        assertThat(Merge.merge(left, right), is(expt));
    }
}