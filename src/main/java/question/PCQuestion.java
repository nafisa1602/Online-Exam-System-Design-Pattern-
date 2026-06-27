package question;

public class PCQuestion implements Question {
    private int points;
    private String difficulty;
    public PCQuestion(int points, String difficulty) {
        this.points = points;
        this.difficulty = difficulty;
    }
    @Override
    public String getType() {
        return "Programming";
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public String getDifficulty() {
        return difficulty;
    }
}
