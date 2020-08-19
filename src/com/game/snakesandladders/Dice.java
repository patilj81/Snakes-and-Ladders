package com.game.snakesandladders;

/**
 * This class represent simple dice which returns number from 1 to 6
 */
public class Dice {
    public int roll() {
        return (int)Math.round(Math.random() * 5.0D + 1.0D);
    }
}
