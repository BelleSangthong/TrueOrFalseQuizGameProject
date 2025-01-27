package belle.sangthong;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RealFakeTest {

    @Test
    void CorrectAnswerScoreIncrease() {
        int oldScore;
        int newScore;
        int increaseAmount = 1;

        belle.sangthong.QuizGame game = new belle.sangthong.QuizGame();

        oldScore = game.getScore();

        game.addQuestion("Is the sky blue?", true);

        game.answerQuestion(true);

        newScore = game.getScore();

        assertTrue(oldScore + increaseAmount == newScore);

        System.out.println("You answered correctly! Score: " + game.getScore());
    }

    @Test
    void IncorrectAnswerScoreNoChange() {
        int oldScore;
        int newScore;
        belle.sangthong.QuizGame game = new belle.sangthong.QuizGame();
        oldScore = game.getScore();


        game.addQuestion("Is the sky blue?", true);

        game.answerQuestion(false);

        newScore = game.getScore();

        assertTrue(oldScore == newScore);

        System.out.println("You answered incorrectly! Score: " + game.getScore());
    }
}
