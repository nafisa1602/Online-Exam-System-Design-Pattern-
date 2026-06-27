package question;

public interface QuestionFactory {
    Question createQuestion();
    QuestionRenderer createQuestionRenderer();
    QuestionEvaluator createQuestionEvaluator();
}
