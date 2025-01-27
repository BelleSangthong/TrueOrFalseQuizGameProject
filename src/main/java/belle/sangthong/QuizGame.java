package belle.sangthong;

public class QuizGame {

    private int score = 0;

    public int getScore() {
        return score;
    }

    public void answerQuestion(boolean correctAnswer) {
        if (correctAnswer) {
            score++;
        }
    }

    public void addQuestion(String question, boolean answer) {
    }

    public void submitAnswer(boolean userAnswer) {
    }
}
