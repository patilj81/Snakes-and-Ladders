package com.game.snakesandladders;


import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void testRoll(){
       int diceNumber = new Dice().roll();
        Assert.assertTrue(diceNumber >= 1 && diceNumber<= 6);
    }
}