package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {

        // Map for giving values to the moves
        Map<Move, Integer> moveValues = new HashMap<>();
        moveValues.put(Move.ROCK, 0);
        moveValues.put(Move.SCISSORS, 1);
        moveValues.put(Move.PAPER, 2);

        // Sorry, i couldn't think of another way to prevent this from failing
        if(mine == Move.PAPER && theirs == Move.ROCK) return Result.WIN;

        // Check for win
        if(moveValues.get(mine) == moveValues.get(theirs) - 1) {
            return Result.WIN;
        // Check for draws
        }else if(moveValues.get(mine).equals(moveValues.get(theirs))) {
            return Result.DRAW;
        }

        return Result.LOSE;
    }
}
