package belle.sangthong;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RealFakeTest {

    @Test
    void CorrectAnswerScoreIncrease() {
        int oldScore;
        int newScore;
        int increaseAmount = 1;

        QuizGame game = new QuizGame();
        oldScore = game.getScore();

        game.addQuestion("Is the sky blue?", true);

        game.getNextQuestion();

        game.answerQuestion(true);
        newScore = game.getScore();

        assertTrue(oldScore + increaseAmount == newScore);

        System.out.println("You answered correctly! Score: " + game.getScore());
    }

    @Test
    void IncorrectAnswerScoreNoChange() {
        int oldScore;
        int newScore;

        QuizGame game = new QuizGame();
        oldScore = game.getScore();

        game.addQuestion("Is the sky blue?", true);

        game.getNextQuestion();

        game.answerQuestion(false);
        newScore = game.getScore();

        assertTrue(oldScore == newScore);

        System.out.println("You answered incorrectly! Score: " + game.getScore());
    }

    @Test
    void MultipleQuestionsScore() {
        int oldScore;
        int newScore;

        QuizGame game = new QuizGame();
        oldScore = game.getScore();

        game.addQuestion("Is the sky blue?", true);
        game.getNextQuestion();
        game.answerQuestion(true);

        game.addQuestion("Is the grass green?", true);
        game.getNextQuestion();
        game.answerQuestion(true);

        game.addQuestion("Is the sun yellow?", true);
        game.getNextQuestion();
        game.answerQuestion(false);

        game.addQuestion("Is the moon made of cheese?", false);
        game.getNextQuestion();
        game.answerQuestion(true);

        newScore = game.getScore();
        assertTrue(oldScore + 2 == newScore);

        System.out.println("Score: " + game.getScore());
    }

    @Test
    void VerifyQuestionHaveRightAnswer() {
        int oldScore;
        int newScore;
        int increaseAmount = 1;
        boolean rightAnswer = true;

        QuizGame game = new QuizGame();
        oldScore = game.getScore();

        game.addQuestion("Is the sky blue?", rightAnswer);

        game.getNextQuestion();

        game.answerQuestion(rightAnswer);
        newScore = game.getScore();

        assertTrue(oldScore + increaseAmount == newScore);

        System.out.println("Score: " + game.getScore());
    }
}
