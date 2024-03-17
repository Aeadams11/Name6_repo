import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProgressTracker {
    private String studentID;
    private Major majorProgram;
    private ArrayList<Course> completedCourses;
    private ArrayList<Course> remainingCourses;
    private double currentGPA;
    private Map<Semester, Double> semesterGPA;
    private Map<Course, Grade> grades;

    public enum Semester {
        SPRING,
        SUMMER,
        FALL,
        WINTER
    }

    public enum Grade {
        A(4.0),
        B(3.0),
        C(2.0),
        D(1.0),
        F(0.0);

        private final double gradeValue;

        Grade(double gradeValue) {
            this.gradeValue = gradeValue;
        }

        public double getGradeValue() {
            return gradeValue;
        }
    }

    public ProgressTracker() {
        this.semesterGPA = new HashMap<>();
        this.grades = new HashMap<>();
        this.completedCourses = new ArrayList<>();
        this.remainingCourses = new ArrayList<>();
    }

    public boolean addCompletedCourse(Course course, Grade grade) {
        if (course != null && !completedCourses.contains(course)) {
            completedCourses.add(course);
            grades.put(course, grade);
            return true;
        }
        return false;
    }

    public void calculateRemainingCourses() {
        for (Course requiredCourse : majorProgram.getRequiredCourses()) {
            if (!completedCourses.contains(requiredCourse)) {
                remainingCourses.add(requiredCourse);
            }
        }
    }

    public boolean checkDegreeCompletion() {
        return remainingCourses.isEmpty();
    }

    public String getProgressReport() {
        StringBuilder report = new StringBuilder();
        report.append("Progress Report:\n");
        report.append("Completed Courses:\n");
        for (Course course : completedCourses) {
            report.append(course.getCourseName()).append("\n");
        }
        report.append("Remaining Courses:\n");
        for (Course course : remainingCourses) {
            report.append(course.getCourseName()).append("\n");
        }
        report.append("Current GPA: ").append(currentGPA).append("\n");
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
        if (totalCredits != 0) {
            currentGPA = totalGPA / totalCredits;
        } else {
            currentGPA = 0.0; 
        }
    }

    public double getSemGPA(Semester semester) {
        
        double semesterTotalGPA = 0.0;
        int semesterTotalCredits = 0;
        for (Map.Entry<Course, Grade> entry : grades.entrySet()) {
            Course course = entry.getKey();
            Grade grade = entry.getValue();
            
            if (course.getSemester() == semester) {
                semesterTotalGPA += grade.getGradeValue() * course.getCreditHours();
                semesterTotalCredits += course.getCreditHours();
            }
        }
        if (semesterTotalCredits != 0) {
            return semesterTotalGPA / semesterTotalCredits;
        } else {
            return 0.0; 
        }
    }

    public boolean updateGrade(Course course, Grade newGrade) {
        if (grades.containsKey(course)) {
            grades.put(course, newGrade);
            calculateCurrentGPA();
            return true;
        }
        return false;
    }

    public Map<Semester, Double> getHistoricalGPA() {
        
        Map<Semester, Double> historicalGPA = new HashMap<>();
        for (Semester semester : Semester.values()) {
            double semesterGPA = getSemGPA(semester);
            historicalGPA.put(semester, semesterGPA);
        }
        return historicalGPA;
    }

    public void getEightSemPlan(String userID) {
        
    }
}
