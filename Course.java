import java.util.HashMap;

public class Course {
    private String courseID;
    private String courseName;
    private String description;
    private String instructor;
    private String meetingTime;
    private HashMap<String, Integer> prerequisites; // Using HashMap to store prerequisite courses with their IDs
    private int creditHours;

    public Course(String courseID, String courseName, String description, String instructor,
                  String meetingTime, int creditHours) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.instructor = instructor;
        this.meetingTime = meetingTime;
        this.creditHours = creditHours;
        this.prerequisites = new HashMap<>(); // Initialize prerequisites as a HashMap
    }

    // Getters and setters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    public HashMap<String, Integer> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(HashMap<String, Integer> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
}
