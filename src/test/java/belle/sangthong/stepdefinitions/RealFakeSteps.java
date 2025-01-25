package belle.sangthong.stepdefinitions;

import belle.sangthong.Question;
import belle.sangthong.QuizGame;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class RealFakeSteps {

    @Given("the user is playing the quiz game")
    public void theUserIsPlayingTheQuizGame() {
        QuizGame quizGame = new QuizGame();
        quizGame.resetScore();
        quizGame.loadQuestions();
    }

    @When("the user answers the question correctly")
    public void theUserAnswersTheQuestionCorrectly() {
        QuizGame quizGame = new QuizGame();
        Question question = quizGame.getCurrentQuestion();
        boolean correctAnswer = question.getCorrectAnswer();
        quizGame.answerQuestion(correctAnswer);
    }
}
