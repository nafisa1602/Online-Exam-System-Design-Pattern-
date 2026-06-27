package source;
import question.*;
import java.util.Random;

public class QuestionGenerator {
    private static String[] difficulties = {"Easy", "Medium", "Hard"};
    private static Random random = new Random();

    public static Question generateQuestion() {
        int type = random.nextInt(4);
        String diff = difficulties[random.nextInt(3)];
        switch (type) {
            case 0: return new MCQQuestion(2, diff);
            case 1: return new TrueFalseQuestion(1, diff);
            case 2: return new EssayQuestion(10, diff);
            default: return new PCQuestion(20, diff);
        }
    }
}
