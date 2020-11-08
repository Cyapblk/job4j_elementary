package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void when10calc() {
        Assert.assertEquals((Factorial.calc(10)), 3628800);
    }

    @Test
    public void when9calc() {
        Assert.assertEquals((Factorial.calc(9)), 362880);
    }
}