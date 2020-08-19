package com.game.snakesandladders;
/**
 * This class represents board with 100 position and having some ladder and snakes
 * This class has private constructor to ensure
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Integer, Integer> ladder;
    private Map<Integer, Integer> snakes;
    private int start;
    private int end;

    private Board(Map<Integer, Integer> ladder, Map<Integer, Integer> snakes) {
        this.start = 0;
        this.end = 100;
        this.ladder = ladder;
        this.snakes = snakes;
    }

    /**
     * This method return instance of Board
     * So each time it will give board having same structures
     * @return {@Link Board}
     */
    public static Board getInstance() {
        Map<Integer, Integer> ladder = new HashMap();
        Map<Integer, Integer> snakes = new HashMap();
        ladder.put(4, 25);
        ladder.put(13, 46);
        ladder.put(50, 100);
        ladder.put(74, 92);
        ladder = Collections.unmodifiableMap(ladder);
        snakes.put(27, 5);
        snakes.put(14, 7);
        snakes.put(73, 53);
        snakes.put(99, 41);
        snakes = Collections.unmodifiableMap(snakes);
        return new Board(ladder, snakes);
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }

    /**
     * This method calculates new position for given current position and dice number
     * it considers all snakes and ladders found in that path
     * @param currentPosition
     * @param diceNumber
     * @return Integer new position
     */
    public int updatePosition(int currentPosition, int diceNumber) {
        if(currentPosition < this.start)
            currentPosition = this.start;
        if (currentPosition + diceNumber >= this.end) {
            return this.end;
        } else {
            int newPosition = currentPosition + diceNumber;
            System.out.println("new position is" + currentPosition + " + " + diceNumber + " = " + newPosition);
            return checkForLadderAndSnakes(newPosition);
        }
    }

    /**
     * This method check for ladder and snakes for position
     * @param newPosition
     * @return Integer new position
     */
    private int checkForLadderAndSnakes(int newPosition) {
        boolean isModified = true;
        while(isModified) {
            isModified = false;
            if (this.ladder.get(newPosition) != null) {
                newPosition = this.ladder.get(newPosition);
                isModified = true;
                System.out.println("Ladder found, new position is = " + newPosition);
            }

            if (this.snakes.get(newPosition) != null) {
                newPosition = this.snakes.get(newPosition);
                isModified = true;
                System.out.println("Snake found, new position is = " + newPosition);
            }
        }
        return newPosition;
    }
}
