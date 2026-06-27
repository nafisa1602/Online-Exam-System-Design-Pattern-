package question;

import source.Source;

public class PCFactory implements QuestionFactory {
    private final Source source;

    public PCFactory(Source source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        return source.getQuestion();
    }

    @Override
    public QuestionRenderer createQuestionRenderer() {
        return new PCRenderer();
    }

    @Override
    public QuestionEvaluator createQuestionEvaluator() {
        return new PCEvaluator();
    }
}
