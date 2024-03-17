import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseName;
    private String description;
    private String instructor;
    private String meetingTime;
    private ArrayList<String> prerequisites;
    private ArrayList<String> corequisites;
    private int creditHours;
    private ProgressTracker.Semester semester; // Corrected type

    public Course(String courseID, String courseName, String description, String instructor,
                  String meetingTime, int creditHours, ProgressTracker.Semester semester) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.instructor = instructor;
        this.meetingTime = meetingTime;
        this.creditHours = creditHours;
        this.semester = semester; // Initialize semester
        this.prerequisites = new ArrayList<>();
        this.corequisites = new ArrayList<>();
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

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public ArrayList<String> getCorequisites() {
        return corequisites;
    }

    public void setCorequisites(ArrayList<String> corequisites) {
        this.corequisites = corequisites;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public ProgressTracker.Semester getSemester() {
        return semester;
    }

    public void setSemester(ProgressTracker.Semester semester) {
        this.semester = semester;
    }
}
