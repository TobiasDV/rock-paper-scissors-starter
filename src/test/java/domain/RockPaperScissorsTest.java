package domain;

import domain.rules.RockPaperScissors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {

    @Test
    @DisplayName("Rock exterminates scissors")
    void rockExterminatesScissors(){
        Rules game = new RockPaperScissors();
        Result result = game.decide(Move.ROCK, Move.SCISSORS);
        assertEquals(Result.WIN, result);
    }

    @Test
    @DisplayName("Scissor obliterates paper")
    void scissorsObliteratesPaper(){
        Rules game = new RockPaperScissors();
        Result result = game.decide(Move.SCISSORS, Move.PAPER);
        assertEquals(Result.WIN, result);
    }

    @Test
    @DisplayName("Paper purges rock")
    void paperPurgesRock(){
        Rules game = new RockPaperScissors();
        Result result = game.decide(Move.PAPER, Move.ROCK);
        assertEquals(Result.WIN, result);
    }
}
