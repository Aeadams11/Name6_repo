import java.util.ArrayList;
import java.util.Map;

public class ProgressTracker {
    private String studentID;
    private Major majorProgram;
    private ArrayList<Course> completedCourses;
    private ArrayList<Course> remainingCourses;
    private double currentGPA;
    private Map<Semester, Double> semesterGPA;
    private Map<Course, Grade> grades;

    public boolean addCompletedCourse(Course course) {
        // Implementation
    }

    public void calculateRemainingCourses() {
        // Implementation
    }

    public boolean checkDegreeCompletion() {
        // Implementation
    }

    public String getProgressReport() {
        // Implementation
    }

    public void calculateCurrentGPA() {
        // Implementation
    }

    public boolean addGrade(Course course, Grade grade) {
        // Implementation
    }

    public double getSemGPA(Semester semester) {
        // Implementation
    }

    public boolean updateGrade(Course course, Grade newGrade) {
        // Implementation
    }

    public Map<Semester, Double> getHistoricalGPA() {
        // Implementation
    }
}
