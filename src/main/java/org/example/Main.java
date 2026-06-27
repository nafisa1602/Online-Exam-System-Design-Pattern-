package org.example;

import configuration.ExamConfiguration;
import examination.*;
import source.QuestionBankSource;
import source.Source;
import question.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExamFactory factory = new MidtermExamFactory();
        Exam exam = factory.createExam();

        Source source = new QuestionBankSource();
        String sourceName = "Question Bank Mode";

        QuestionFactory mcqFactory = new MCQFactory(source);
        QuestionFactory essayFactory = new EssayFactory(source);
        QuestionFactory programmingFactory = new PCFactory(source);
        QuestionFactory trueFalseFactory = new TrueFalseFactory(source);

        ExamConfiguration config = new ExamConfiguration.Builder()
                .title("OOP Midterm Exam")
                .duration(60)
                .passingScore(50)
                .negativeMarking(true)
                .questionShuffle(true)
                .autoSubmit(true)
                .calculatorAllowed(false)
                .build();

        List<Question> questions = new ArrayList<>();
        questions.add(mcqFactory.createQuestion());
        questions.add(mcqFactory.createQuestion());
        questions.add(essayFactory.createQuestion());
        questions.add(programmingFactory.createQuestion());
        questions.add(trueFalseFactory.createQuestion());

        printDashboard(exam, config, sourceName, questions);
    }

    static void printDashboard(Exam exam, ExamConfiguration config,
                               String sourceName, List<Question> questions) {

        System.out.println("=====================================================================");
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println("=====================================================================");
        System.out.println("Type: " + exam.getType());
        System.out.println("Title: " + config.getTitle());
        System.out.println("Duration: " + config.getDuration() + " minutes");
        System.out.println("Passing Score: " + config.getPassingScore() + " Marks");
        System.out.println("Configuration Profiles:");
        System.out.println("  " + (config.isNegativeMarking() ? "✓" : "✗") + " Negative Marking Enabled");
        System.out.println("  " + (config.isQuestionShuffle() ? "✓" : "✗") + " Question Shuffle Activated");
        System.out.println("  " + (config.isCalculatorAllowed() ? "✓" : "✗") + " Embedded Calculator Allowed");
        System.out.println("  " + (config.isAutoSubmit() ? "✓" : "✗") + " Auto-Submit On Timeout");
        System.out.println("Question Sourcing Strategy: " + sourceName);
        System.out.println("Compiled Structural Components:");
        for (Question q : questions) {
            System.out.println("  - [Type: " + q.getType() + "] Points: "
                    + q.getPoints() + " Difficulty: " + q.getDifficulty());
        }
        System.out.println("=====================================================================");
    }
}
