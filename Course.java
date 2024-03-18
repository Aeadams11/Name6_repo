import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
    private String courseID;
    private String courseName;
    private String description;
    private String instructor;
    private String meetingTime;
    private Map<String, List<String>> prerequisites;
    private Map<String, List<String>> corequisites;
    private int creditHours;
    private char minGrade;
    private String department;
    String semester;

    public Course(String courseID, String courseName, String description, String instructor,
            String meetingTime, int creditHours, String semester) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.instructor = instructor;
        this.meetingTime = meetingTime;
        this.creditHours = creditHours;
        this.prerequisites = new HashMap<>();
        this.corequisites = new HashMap<>();
        this.semester = semester;
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

    public void addPrerequisite(String prereqCourseID) {
        this.prerequisites.computeIfAbsent(this.courseID, k -> new ArrayList<>()).add(prereqCourseID);
    }

    public void addCorequisite(String coreqCourseID) {
        this.corequisites.computeIfAbsent(this.courseID, k -> new ArrayList<>()).add(coreqCourseID);
    }

    public Map<String, List<String>> getPreReqs() {
        return prerequisites;
    }

    public Map<String, List<String>> getCoreReqs() {
        return corequisites;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
