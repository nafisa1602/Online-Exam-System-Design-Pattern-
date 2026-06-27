package question;

public class TrueFalseEvaluator implements QuestionEvaluator {
    @Override
    public int evaluateQuestion(Question question, String answer) {
        if (answer.equalsIgnoreCase("True")) {
            return question.getPoints();
        }
        return 0;
    }
}
