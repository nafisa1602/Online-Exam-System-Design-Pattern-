package question;

public class EssayQuestion implements Question {
    private int points;
    private String difficulty;

    public EssayQuestion(int points, String difficulty) {
        this.points = points;
        this.difficulty = difficulty;
    }

    public String getType() {
        return "Essay";
    }
    public int getPoints() {
        return points;
    }
    public String getDifficulty() {
        return difficulty;
    }
}
