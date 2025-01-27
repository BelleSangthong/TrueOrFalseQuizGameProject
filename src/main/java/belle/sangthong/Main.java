package belle.sangthong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuizGame game = new QuizGame();
        Scanner scanner = new Scanner(System.in);

        game.addQuestion("Is the sky blue?", true);
        game.addQuestion("Is the grass red?", false);
        game.addQuestion("Is water wet?", true);
        game.addQuestion("Is the sun hot?", true);
        game.addQuestion("Is the moon made of cheese?", false);

        while (game.hasMoreQuestions()) {
            Question question = game.getNextQuestion();
            System.out.println(question.getText() + " (true/false)");

            boolean userAnswer = scanner.nextBoolean();
            game.answerQuestion(userAnswer);
        }

        System.out.println("Your score is: " + game.getScore());
    }
}