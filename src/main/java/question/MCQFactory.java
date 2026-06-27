package question;

import source.Source;

public class MCQFactory implements QuestionFactory {

    private Source source;
    public MCQFactory(Source source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        return source.getQuestion();
    }

    @Override
    public QuestionRenderer createQuestionRenderer() {
        return new MCQRenderer();
    }

    @Override
    public QuestionEvaluator createQuestionEvaluator() {
        return new MCQEvaluator();
    }
}
