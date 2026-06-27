package source;

import question.Question;

public class QuestionGeneratorSource implements Source {
    public Question getQuestion() {
        return QuestionGenerator.generateQuestion();
    }
}
