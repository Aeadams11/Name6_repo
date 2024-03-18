import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProgressTracker {
    private String studentID;
    private Major majorProgram;
    private List<Course> completedCourses;
    private List<Course> remainingCourses;
    private double currentGPA;
    private Map<String, Double> semesterGPA; // Changed to use String key
    private Map<Course, Grade> grades;

    public ProgressTracker(String studentID, Major majorProgram) {
        this.studentID = studentID;
        this.majorProgram = majorProgram;
        this.completedCourses = new ArrayList<>();
        this.remainingCourses = new ArrayList<>();
        this.semesterGPA = new HashMap<>();
        this.grades = new HashMap<>();
    }

    public void addCompletedCourse(Course course, Grade grade) {
        completedCourses.add(course);
        grades.put(course, grade);
        calculateCurrentGPA();
        calculateRemainingCourses();
    }

    public void calculateRemainingCourses() {
        remainingCourses.clear();
        for (Course course : majorProgram.getRequiredCourses()) {
            if (!completedCourses.contains(course)) {
                remainingCourses.add(course);
            }
        }
    }

    public boolean checkDegreeCompletion() {
        return remainingCourses.isEmpty();
    }

    public String getProgressReport() {
        StringBuilder report = new StringBuilder();
        report.append("Progress Report for Student: ").append(studentID).append("\n\n");
        report.append("Completed Courses:\n");
        for (Course course : completedCourses) {
            report.append(course.getCourseName()).append("\n");
        }
        report.append("\nRemaining Courses:\n");
        for (Course course : remainingCourses) {
            report.append(course.getCourseName()).append("\n");
        }
        report.append("\nCurrent GPA: ").append(currentGPA);
        return report.toString();
    }

    public void calculateCurrentGPA() {
        double totalGPA = 0.0;
        int totalCredits = 0;
        for (Map.Entry<Course, Grade> entry : grades.entrySet()) {
            Course course = entry.getKey();
            Grade grade = entry.getValue();
            totalGPA += grade.getGradeValue() * course.getCreditHours();
            totalCredits += course.getCreditHours();
        }
        currentGPA = (totalCredits != 0) ? totalGPA / totalCredits : 0.0;
    }

    public double getSemGPA(String semester) {
        double semesterTotalGPA = 0.0;
        int semesterTotalCredits = 0;
        for (Map.Entry<Course, Grade> entry : grades.entrySet()) {
            Course course = entry.getKey();
            Grade grade = entry.getValue();
            if (semester.equals(course.getSemester())) {
                semesterTotalGPA += grade.getGradeValue() * course.getCreditHours();
                semesterTotalCredits += course.getCreditHours();
            }
        }
        return (semesterTotalCredits != 0) ? semesterTotalGPA / semesterTotalCredits : 0.0;
    }

    public boolean updateGrade(Course course, Grade newGrade) {
        if (grades.containsKey(course)) {
            grades.put(course, newGrade);
            calculateCurrentGPA();
            return true;
        }
        return false;
    }

    public Map<String, Double> getHistoricalGPA() {
        Map<String, Double> historicalGPA = new HashMap<>();
        for (String semester : semesterGPA.keySet()) {
            historicalGPA.put(semester, semesterGPA.get(semester));
        }
        return historicalGPA;
    }

    public void getEightSemPlan(String userID) {
        // Placeholder logic to generate an eight-semester plan for a given user ID
    }
}
