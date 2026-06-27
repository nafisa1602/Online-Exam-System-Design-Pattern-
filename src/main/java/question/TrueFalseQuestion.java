package question;

public class TrueFalseQuestion implements Question {

    private int points;
    private String difficulty;

    public TrueFalseQuestion(int points, String difficulty) {
        this.points = points;
        this.difficulty = difficulty;
    }

    @Override
    public String getType() {
        return "TrueFalse";
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
