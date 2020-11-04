package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int exp = 5;
        int out = ChessBoard.way(6, 7, 1, 2);
        Assert.assertEquals(exp, out);

    }

    @Test
    public void wayIs7() {
        int exp = 7;
        int out = ChessBoard.way(7, 0, 0, 7);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void wayIs0() {
        int exp = 0;
        int out = ChessBoard.way(2, 6, 4, 1);
        Assert.assertEquals(exp, out);
    }

}