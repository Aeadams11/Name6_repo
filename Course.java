import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseName;
    private String description;
    private String instructor; // Assuming this is an ID or identifier for an instructor
    private String meetingTime;
    private ArrayList<String> prerequisites; // Keeping as String for IDs
    private ArrayList<String> corequisites; // Similarly for corequisites
    private int creditHours;
    private char minGrade;
    private String department;

    public Course(String courseID, String courseName, String description, String instructor,
            String meetingTime, int creditHours, char minGrade, String department) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.instructor = instructor;
        this.meetingTime = meetingTime;
        this.creditHours = creditHours;
        this.prerequisites = new ArrayList<>();
        this.corequisites = new ArrayList<>();
        this.minGrade = minGrade;
        this.department = department;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<String> getPreReqs() {
        return prerequisites;
    }

    public void setPreReqs(ArrayList<String> preReqs) {
        this.prerequisites = preReqs;
    }

    public char getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(char minGrade) {
        this.minGrade = minGrade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
