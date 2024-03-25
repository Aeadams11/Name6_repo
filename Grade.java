public class Grade {
    private int score; // Numerical score

    public Grade(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public double getGradeValue() {
        if (score >= 90) return 4.0;
        else if (score >= 80) return 3.0;
        else if (score >= 70) return 2.0;
        else if (score >= 60) return 1.0;
        else return 0.0;
    }

    public String toLetterGrade() {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }
}
