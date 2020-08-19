package com.game.snakesandladders;

public class Main {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Player player = new Player("jiggs");
        Board board = Board.getInstance();
        player.setPosition(board.getStart());
        Dice dice = new CrookedDice();
        (new Game(player, board, dice, 10)).startGame();
    }

}
