package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        Assert.assertEquals(Fitness.dogon(95, 90), 0);
    }

    @Test
    public void whenIvanLessByOneNik() {
        Assert.assertEquals(Fitness.dogon(90, 95), 1);
    }

    @Test
    public void whenIvanLessByFewNik() {
        Assert.assertEquals(Fitness.dogon(50, 90), 2);
    }
}