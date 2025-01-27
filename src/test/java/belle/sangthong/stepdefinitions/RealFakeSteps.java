package belle.sangthong.stepdefinitions;

import belle.sangthong.QuizGame;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RealFakeSteps {

    private QuizGame game;

    @Given("the user is playing the quiz game")
    public void theUserIsPlayingTheQuizGame() {
        game = new QuizGame();
    }

    @When("the user answers the question correctly")
    public void theUserAnswersTheQuestionCorrectly() {
        game.answerQuestion(true);
    }

    @Then("the user should receive 1 point")
    public void theUserShouldReceive1Point() {
        assertEquals(1, game.getScore());
    }

    @When("the user answers the question incorrectly")
    public void theUserAnswersTheQuestionIncorrectly() {
        game.answerQuestion(false);
    }

    @Then("the user should receive 0 points")
    public void theUserShouldReceive0Points() {
        assertEquals(0, game.getScore());
    }


}
