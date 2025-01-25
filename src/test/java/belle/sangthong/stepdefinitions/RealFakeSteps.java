package belle.sangthong.stepdefinitions;

import io.cucumber.java.en.Given;

public class RealFakeSteps {

    @Given("the user is playing the quiz game")
    public void theUserIsPlayingTheQuizGame() {
        QuizGame quizGame = new QuizGame();

    }
}
