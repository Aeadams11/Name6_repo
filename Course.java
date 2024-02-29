import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseName;
    // hashmap?
    private ArrayList<Course> preReqs;
    private char minGrade;
    private String department;

    public Course(String courseID, String courseName, char minimumGrade, String department) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.minGrade = minimumGrade;
        this.department = department;

    }

    // Getter and setter methods here
}
