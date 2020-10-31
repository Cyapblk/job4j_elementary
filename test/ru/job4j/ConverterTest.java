package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in  = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenConverter140RblThen2Dollar() {
        int in = 140;
        float expected = 2.33F;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.1);
        }
}