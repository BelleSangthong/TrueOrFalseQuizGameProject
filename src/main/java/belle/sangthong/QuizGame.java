package belle.sangthong;

import java.util.ArrayList;
import java.util.List;

public class QuizGame {

    private List<Question> questions;
    private PlayerScore player;
    private int currentQuestionIndex;

    public QuizGame() {
        this.questions = new ArrayList<>();
        this.player = new PlayerScore();
        this.currentQuestionIndex = 0;
    }

    public void addQuestion(String text, boolean correctAnswer) {
        questions.add(new Question(text, correctAnswer));
    }

    public Question getNextQuestion() {
        if (currentQuestionIndex < questions.size()) {
            return questions.get(currentQuestionIndex++);
        }
        return null;
    }

    public void answerQuestion(boolean userAnswer) {
        Question currentQuestion = questions.get(currentQuestionIndex - 1);
        if (currentQuestion.checkAnswer(userAnswer)) {
            player.addPoint();
        }
    }

    public int getScore() {
        return player.getScore();
    }

    public boolean hasMoreQuestions() {
        return currentQuestionIndex < questions.size();
    }
}
