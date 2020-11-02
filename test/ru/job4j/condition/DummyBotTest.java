package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String exp = "Привет, умник.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String exp = "До скорой встречи";
        String out = DummyBot.answer(in);
        Assert.assertEquals(exp, out);
    }

    @Test

    public void whenUnknownBot() {
        String in = "Есть Чё?";
        String exp = "Это ставит меня в тупик. Задайте другой вопрос.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(exp, out);
    }
}