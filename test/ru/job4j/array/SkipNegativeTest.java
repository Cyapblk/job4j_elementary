package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] input = {
                {-1, 2, 1},
                {1, -2, 333},
                {11, 12, -363}
        };
        int[][] expect = {
                {0, 2, 1},
                {1, 0, 333},
                {11, 12, 0}
        };
        assertThat((SkipNegative.skip(input)), is(expect));
    }
}
