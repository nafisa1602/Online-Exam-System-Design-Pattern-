package configuration;

public class ExamConfiguration {
    private final String title;
    private final int duration;
    private final int passingScore;
    private final boolean negativeMarking;
    private final boolean questionShuffle;
    private final boolean autoSubmit;
    private final boolean calculatorAllowed;

    private ExamConfiguration(Builder builder) {
        this.title = builder.title;
        this.duration = builder.duration;
        this.passingScore = builder.passingScore;
        this.negativeMarking = builder.negativeMarking;
        this.questionShuffle = builder.questionShuffle;
        this.autoSubmit = builder.autoSubmit;
        this.calculatorAllowed = builder.calculatorAllowed;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getPassingScore() {
        return passingScore;
    }

    public boolean isNegativeMarking() {
        return negativeMarking;
    }

    public boolean isQuestionShuffle() {
        return questionShuffle;
    }

    public boolean isAutoSubmit() {
        return autoSubmit;
    }

    public boolean isCalculatorAllowed() {
        return calculatorAllowed;
    }

    public static class Builder {
        private String title;
        private int duration;
        private int passingScore;
        private boolean negativeMarking;
        private boolean questionShuffle;
        private boolean autoSubmit;
        private boolean calculatorAllowed;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder passingScore(int passingScore) {
            this.passingScore = passingScore;
            return this;
        }

        public Builder negativeMarking(boolean negativeMarking) {
            this.negativeMarking = negativeMarking;
            return this;
        }

        public Builder questionShuffle(boolean questionShuffle) {
            this.questionShuffle = questionShuffle;
            return this;
        }

        public Builder autoSubmit(boolean autoSubmit) {
            this.autoSubmit = autoSubmit;
            return this;
        }

        public Builder calculatorAllowed(boolean calculatorAllowed) {
            this.calculatorAllowed = calculatorAllowed;
            return this;
        }

        public ExamConfiguration build() {
            return new ExamConfiguration(this);
        }
    }

}
