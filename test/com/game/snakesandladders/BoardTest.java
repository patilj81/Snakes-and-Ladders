package com.game.snakesandladders;



import org.junit.Assert;
import org.junit.Test;


public class BoardTest {

    @Test
    public void testPosition() {
        Board board = Board.getInstance();
        int newPosition = board.updatePosition(11,3);
        Assert.assertEquals(newPosition,7);
    }

    @Test
    public void testEnd() {
        Board board = Board.getInstance();
        int newPosition = board.updatePosition(96,5);
        Assert.assertEquals(newPosition,board.getEnd());
    }

    @Test
    public void testStart() {
        Board board = Board.getInstance();
        int newPosition = board.updatePosition(-1,0);
        Assert.assertEquals(newPosition,board.getStart());
    }
}