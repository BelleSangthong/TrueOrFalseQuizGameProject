package belle.sangthong.stepdefinitions;

import belle.sangthong.Question;
import belle.sangthong.QuizGame;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RealFakeSteps {

    private QuizGame quizGame = new QuizGame();

    @Given("the user is playing the quiz game")
    public void theUserIsPlayingTheQuizGame() {
        quizGame.resetScore();
        quizGame.loadQuestions();
    }

    @When("the user answers the question correctly")
    public void theUserAnswersTheQuestionCorrectly() {
        Question question = quizGame.getCurrentQuestion();
        boolean correctAnswer = question.getCorrectAnswer();
        quizGame.answerQuestion(correctAnswer);
    }

    @Then("the user should receive 1 point")
    public void theUserShouldReceive1Point() {
        int score = quizGame.getScore();
        assert score == 1;
    }

    @Given("the user is playing the quiz game")
    public void theUserIsPlayingTheQuizGameWithIncorrectAnswer() {
        quizGame.resetScore();
        quizGame.loadQuestions();
    }

    @When("the user answers the question incorrectly")
    public void theUserAnswersTheQuestionIncorrectly() {
        Question question = quizGame.getCurrentQuestion();
        boolean incorrectAnswer = !question.getCorrectAnswer();
        quizGame.answerQuestion(incorrectAnswer);
    }

    @Then("the user should receive 0 points")
    public void theUserShouldReceive0Points() {
        int score = quizGame.getScore();
        assert score == 0;
    }


}
