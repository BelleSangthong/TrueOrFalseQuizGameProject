package belle.sangthong.stepdefinitions;

import belle.sangthong.QuizGame;
import io.cucumber.java.en.Given;

import static org.junit.jupiter.api.Assertions.*;

public class RealFakeSteps {

    @Given("the user is playing the quiz game")
    public void theUserIsPlayingTheQuizGame() {
        QuizGame quizGame = new QuizGame();
        quizGame.resetScore();
        quizGame.loadQuestions();
    }
}
