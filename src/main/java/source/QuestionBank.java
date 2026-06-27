package source;
import question.*;
import java.util.List;
import java.util.ArrayList;

public class QuestionBank {
    private static List<Question> bank = new ArrayList<>();

    static {
        bank.add(new MCQQuestion(2, "Medium"));
        bank.add(new MCQQuestion(2, "Easy"));
        bank.add(new EssayQuestion(10, "Hard"));
        bank.add(new PCQuestion(20, "Hard"));
        bank.add(new TrueFalseQuestion(1, "Easy"));
    }
    public static List<Question> getBank() { return bank; }
}
