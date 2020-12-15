package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxTriple() {
        Assert.assertEquals(7, Max.max(7, 2, 0));
    }

    @Test
    public void maxQuad() {
        Assert.assertEquals(9, Max.max(7, 3, 4, 9));
    }
}





