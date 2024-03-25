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
        
        // Creating a ProgressTracker instance
        ProgressTracker tracker = new ProgressTracker("studentID", new Major("Computer Science"));
        
        // Creating a sample Course and Grade object
        Course course = new Course("CS101", "Intro to Computer Science", "Description", "Instructor", "Time", 4, "Semester");
        Grade grade = new Grade(95);
        
        // Adding completed course
        tracker.addCompletedCourse(course, grade);
        
        // Checking if course is in completed courses
        List<Course> completedCourses = tracker.getCompletedCourses();
        boolean isCourseAdded = completedCourses.contains(course);
        
        // Printing expected and actual outcomes
        System.out.println("Expected Outcome: Course added to completed courses: true, Actual Outcome: Course added to completed courses: " + isCourseAdded);
        
        System.out.println("Completed testAddCompletedCourse.");
    }

    private static void testRemoveCompletedCourse() {
        System.out.println("Running testRemoveCompletedCourse...");
        
        // Creating a ProgressTracker instance
        ProgressTracker tracker = new ProgressTracker("studentID", new Major("Computer Science"));
        
        // Creating a sample Course and Grade object
        Course course = new Course("CS101", "Intro to Computer Science", "Description", "Instructor", "Time", 4, "Semester");
        Grade grade = new Grade(95);
        
        // Adding and then removing completed course
        tracker.addCompletedCourse(course, grade);
        tracker.removeCompletedCourse(course);
        
        // Checking if course is removed from completed courses
        List<Course> completedCourses = tracker.getCompletedCourses();
        boolean isCourseRemoved = !completedCourses.contains(course);
        
        // Printing expected and actual outcomes
        System.out.println("Expected Outcome: Course removed from completed courses: true, Actual Outcome: Course removed from completed courses: " + isCourseRemoved);
        
        System.out.println("Completed testRemoveCompletedCourse.");
    }

    private static void testCheckDegreeCompletion() {
        System.out.println("Running testCheckDegreeCompletion...");
        
        // Creating a ProgressTracker instance
        ProgressTracker tracker = new ProgressTracker("studentID", new Major("Computer Science"));
        
        // Initially degree completion should be false
        boolean isDegreeCompleted = tracker.checkDegreeCompletion();
        
        // Printing expected and actual outcomes
        System.out.println("Expected Outcome: Degree completion status: false, Actual Outcome: Degree completion status: " + isDegreeCompleted);
        
        System.out.println("Completed testCheckDegreeCompletion.");
    }

    private static void testCalculateCurrentGPA() {
        System.out.println("Running testCalculateCurrentGPA...");
        
        // Creating a ProgressTracker instance
        ProgressTracker tracker = new ProgressTracker("studentID", new Major("Computer Science"));
        
        // Creating sample Course and Grade objects
        Course course1 = new Course("CS101", "Intro to Computer Science", "Description", "Instructor", "Time", 4, "Semester");
        Grade gradeA = new Grade(95);
        Course course2 = new Course("CS102", "Data Structures", "Description", "Instructor", "Time", 4, "Semester");
        Grade gradeB = new Grade(85);
        
        // Adding completed courses with grades
        tracker.addCompletedCourse(course1, gradeA);
        tracker.addCompletedCourse(course2, gradeB);
        
        // Calculating current GPA (Manually calculated)
        double expectedGPA = (gradeA.getGradeValue() * course1.getCreditHours() + gradeB.getGradeValue() * course2.getCreditHours())
                / (course1.getCreditHours() + course2.getCreditHours());
        
        // Getting actual GPA
        double actualGPA = tracker.getCurrentGPA();
        
        // Printing expected and actual outcomes
        System.out.println("Expected Outcome: Current GPA: " + expectedGPA + ", Actual Outcome: Current GPA: " + actualGPA);
        
        System.out.println("Completed testCalculateCurrentGPA.");
    }
}
