package belle.sangthong;

public class PlayerScore {
    private int score;

    public PlayerScore() {
        this.score = 0;
    }

    public void addPoint() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
