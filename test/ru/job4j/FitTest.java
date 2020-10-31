package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenmanWeight185Then97() {
        short in = 185;
        double exp = 97.74;
        double out = Fit.manWeight(in);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void whenwomanWeight86() {
        short in = 185;
        double exp = 86.35;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(exp, out, 0.1);
    }
}