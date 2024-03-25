public class Grade {
    private Course course;
    private char grade;
    private int numGrade;

    public Grade(Course course, char grade) {
        this.course = course;
        this.grade = grade; 
    }

    public boolean passed() {
        //return true if passed
        return true;
    }

    public double gpaPoints() {
        // return gpa point value, take into consideration credit hours
        return 3.0; 
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
    public double getGradeValue() {
        if (numGrade >= 90) return 4.0;
        else if (numGrade >= 80) return 3.0;
        else if (numGrade >= 70) return 2.0;
        else if (numGrade >= 60) return 1.0;
        else return 0.0;
    }
}
