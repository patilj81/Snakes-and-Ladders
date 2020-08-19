package com.game.snakesandladders;

/**
 * This class represents Snakes and ladders game
 */
public class Game {
    private Player player;
    private Board board;
    private Dice dice;
    private int turns;

    public Game(Player player, Board board, Dice dice, int turns) {
        this.player = player;
        this.board = board;
        this.dice = dice;
        this.turns = turns;
    }

    /**
     * This method plays game till turns get completed.
     */
    public void startGame() {
        while(this.turns > 0) {
            this.rollDice();
        }

        System.out.println("Game finished.....");
    }

    /**
     * This method rolls a dice and updates players position
     * if player reached to end then he wins the game and if not he loses the game
     */
    private void rollDice() {
        int diceNumber = this.dice.roll();
        int newPosition = this.board.updatePosition(this.player.getPosition(), diceNumber);
        this.player.setPosition(newPosition);
        --this.turns;
        if (newPosition == this.board.getEnd()) {
            System.out.println("You won the game");
            this.turns = 0;
        } else if (this.turns == 0) {
            System.out.println("You lose the game");
        }

    }
}
