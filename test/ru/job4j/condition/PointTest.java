package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whendistance00to20Then() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        float expected = 2.0F;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whendistance36to62Then() {
        int x1 = 3;
        int y1 = 6;
        int x2 = 6;
        int y2 = 2;
        float expected = 5.0F;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whendistance4050to6070Then() {
        int x1 = 40;
        int y1 = 50;
        int x2 = 60;
        int y2 = 70;
        float expected = 28.28F;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }
}