package belle.sangthong;

public class QuizGame {

    private int score = 0;

    public int getScore() {
        return score;
    }

    public void answerQuestion(boolean userAnswer) {
        if (userAnswer) {
            score++;
        }
    }

    public void addQuestion(String question, boolean correctAnswer) {
    }


}
