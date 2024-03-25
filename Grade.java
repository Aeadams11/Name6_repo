public class Grade {
    private Course course;
    private char grade;
    private int score;

    public Grade(Course course, int score) {
        this.course = course;
        this.setScore(score);
    }

    public void setScore(int score) {
        this.score = score;
        this.grade = toLetterGrade().charAt(0);
    }

    public int getScore() {
        return score;
    }

    public double getGradeValue() {
        if (score >= 90)
            return 4.0;
        else if (score >= 80)
            return 3.0;
        else if (score >= 70)
            return 2.0;
        else if (score >= 60)
            return 1.0;
        else
            return 0.0;
    }

    public String toLetterGrade() {
        if (score >= 90)
            return "A";
        else if (score >= 80)
            return "B";
        else if (score >= 70)
            return "C";
        else if (score >= 60)
            return "D";
        else
            return "F";
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade [course=" + course + ", grade=" + grade + ", score=" + score + "]";
    }
}
