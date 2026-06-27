package question;

public class EssayEvaluator implements QuestionEvaluator {

    @Override
    public int evaluateQuestion(Question question, String answer) {
        if(answer.length() > 50){
            return question.getPoints();
        }
        return 0;
    }
}
