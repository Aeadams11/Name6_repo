import java.util.ArrayList;
import java.util.List;

public class ProgressTrackerTest {

    public static void main(String[] args) {
        testAddCompletedCourse();
        testRemoveCompletedCourse();
        testCheckDegreeCompletion();
        testCalculateCurrentGPA();
    }

    private static void testAddCompletedCourse() {
        System.out.println("Running testAddCompletedCourse...");
        
        ProgressTracker tracker = new ProgressTracker("studentID", new Major("Computer Science"));
        
        Course course = new Course("CS101", "Intro to Computer Science", "Description", "Instructor", "Time", 4, "Semester");
        Grade grade = new Grade(95);
        
        tracker.addCompletedCourse(course, grade);
        
        List<Course> completedCourses = tracker.getCompletedCourses();
        boolean isCourseAdded = completedCourses.contains(course);

        System.out.println("Expected Outcome: Course added to completed courses: true, Actual Outcome: Course added to completed courses: " + isCourseAdded);
        
        System.out.println("Completed testAddCompletedCourse.");
    }

    private static void testRemoveCompletedCourse() {
        System.out.println("Running testRemoveCompletedCourse...");
        
        ProgressTracker tracker = new ProgressTracker("studentID", new Major("Computer Science"));
        
        Course course = new Course("CS101", "Intro to Computer Science", "Description", "Instructor", "Time", 4, "Semester");
        Grade grade = new Grade(95);
       
        tracker.addCompletedCourse(course, grade);
        tracker.removeCompletedCourse(course);
        
        List<Course> completedCourses = tracker.getCompletedCourses();
        boolean isCourseRemoved = !completedCourses.contains(course);
        
        System.out.println("Expected Outcome: Course removed from completed courses: true, Actual Outcome: Course removed from completed courses: " + isCourseRemoved);
        
        System.out.println("Completed testRemoveCompletedCourse.");
    }

    private static void testCheckDegreeCompletion() {
        System.out.println("Running testCheckDegreeCompletion...");
       
        ProgressTracker tracker = new ProgressTracker("studentID", new Major("Computer Science"));
    
        boolean isDegreeCompleted = tracker.checkDegreeCompletion();
        
        System.out.println("Expected Outcome: Degree completion status: false, Actual Outcome: Degree completion status: " + isDegreeCompleted);
        
        System.out.println("Completed testCheckDegreeCompletion.");
    }

    private static void testCalculateCurrentGPA() {
        System.out.println("Running testCalculateCurrentGPA...");
        
        ProgressTracker tracker = new ProgressTracker("studentID", new Major("Computer Science"));
        
        Course course1 = new Course("CS101", "Intro to Computer Science", "Description", "Instructor", "Time", 4, "Semester");
        Grade gradeA = new Grade(95);
        Course course2 = new Course("CS102", "Data Structures", "Description", "Instructor", "Time", 4, "Semester");
        Grade gradeB = new Grade(85);
        
        tracker.addCompletedCourse(course1, gradeA);
        tracker.addCompletedCourse(course2, gradeB);
        
        double expectedGPA = (gradeA.getGradeValue() * course1.getCreditHours() + gradeB.getGradeValue() * course2.getCreditHours())
                / (course1.getCreditHours() + course2.getCreditHours());
        
        double actualGPA = tracker.getCurrentGPA();
        
        System.out.println("Expected Outcome: Current GPA: " + expectedGPA + ", Actual Outcome: Current GPA: " + actualGPA);
        
        System.out.println("Completed testCalculateCurrentGPA.");
    }
}
