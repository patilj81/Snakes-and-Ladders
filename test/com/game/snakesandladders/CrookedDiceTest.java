package com.game.snakesandladders;

import org.junit.Assert;
import org.junit.Test;


public class CrookedDiceTest {

    @Test
    public void testRoll(){
        int diceNumber = new CrookedDice().roll();
        Assert.assertTrue(diceNumber >= 2 && diceNumber<= 6);
    }

    @Test
    public void testRoll1(){
        int diceNumber = new CrookedDice().roll();
        Assert.assertEquals(diceNumber % 2 , 0);
    }
}