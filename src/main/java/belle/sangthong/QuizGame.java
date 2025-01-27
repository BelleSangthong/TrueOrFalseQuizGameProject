package belle.sangthong;

public class QuizGame {

    private String question;
    private boolean answer;
    private int score = 0;

    public boolean checkAnswer(boolean answer) {
        return this.answer == answer;
    }

    public void addScore() {
        score++;
    }

    public void answerQuestion(boolean userAnswer) {
        if (checkAnswer(userAnswer)) {
            addScore();
        }
    }

    public void addQuestion(String question, boolean correctAnswer) {
        this.question = question;
        this.answer = correctAnswer;
    }

    public int getScore() {
        return score;
    }
}
