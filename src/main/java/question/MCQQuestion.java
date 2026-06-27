package question;

public class MCQQuestion implements Question {

    private int points;
    private String difficulty;

    public MCQQuestion(int points, String difficulty) {
        this.points = points;
        this.difficulty = difficulty;
    }

    @Override
    public String getType() {
        return "MCQ";
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
