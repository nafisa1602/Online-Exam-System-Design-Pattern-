package question;
import source.Source;

public class EssayFactory implements QuestionFactory {
    private Source source;
    public EssayFactory(Source source) {
        this.source = source;
    }
    @Override
    public Question createQuestion() {
        return source.getQuestion();
    }

    @Override
    public QuestionRenderer createQuestionRenderer() {
        return new EssayRenderer();
    }

    @Override
    public QuestionEvaluator createQuestionEvaluator() {
        return new EssayEvaluator();
    }
}
