package question;

public class MCQEvaluator implements QuestionEvaluator {
    @Override
    public int evaluateQuestion(Question question, String answer) {
        if (answer.equalsIgnoreCase("A")) {
            return question.getPoints();
        }
        return 0;
    }
}
