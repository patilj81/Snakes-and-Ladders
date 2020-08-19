package com.game.snakesandladders;

/**
 * This class represents crooked dice which returns only even number
 */
public class CrookedDice extends Dice {
    public int roll() {
        int number = super.roll();
        return number % 2 == 0 ? number : number + 1;
    }
}
