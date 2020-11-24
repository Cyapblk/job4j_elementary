package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenM100P1rest() {
        int[] expected = {10, 10, 10, 10, 10, 10, 10, 10, 10, 5, 2, 2};
        assertThat((Machine.rest(100, 1)), is(expected));
    }

    @Test
    public void whenM50P50rest() {
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertThat((Machine.rest(50, 50)), is(expected));
    }

    @Test
    public void whenM50P35rest() {
        int[] expected = {10, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertThat((Machine.rest(50, 35)), is(expected));
    }

    @Test
    public void whenM50P2rest() {
        int[] expected = {10, 10, 10, 10, 5, 2, 1, 0, 0, 0, 0, 0};
        assertThat((Machine.rest(50, 2)), is(expected));
    }

    @Test
    public void whenM100P100rest() {
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertThat((Machine.rest(100, 100)), is(expected));
    }

}