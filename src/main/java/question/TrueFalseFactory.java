package question;
import source.Source;

public class TrueFalseFactory implements QuestionFactory {

    private Source source;
    public TrueFalseFactory(Source source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        return source.getQuestion();
    }

    @Override
    public QuestionRenderer createQuestionRenderer() {
        return new TrueFalseRenderer();
    }

    @Override
    public QuestionEvaluator createQuestionEvaluator() {
        return new TrueFalseEvaluator();
    }
}
