package source;

import question.*;

import java.util.List;
import java.util.Random;

public class QuestionBankSource implements Source {
    private final List<Question> bank;
    private final Random random = new Random();

    public QuestionBankSource() {
        this.bank = QuestionBank.getBank();
    }

    public Question getQuestion() {
        return bank.get(random.nextInt(bank.size()));
    }
}
