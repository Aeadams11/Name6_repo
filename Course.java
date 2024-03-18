import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
    private String courseID;
    private String subject;
    private String courseNumber;
    private String courseName;
    private String description;
    private Map<String, List<String>> prerequisites;
    private Map<String, List<String>> corequisites;
    private int creditHours;
    private ArrayList<String> semesters;

    public Course(String courseID, String courseName, String description, String instructor,
            String meetingTime, int creditHours, ArrayList<String> semesters) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.creditHours = creditHours;
        this.prerequisites = new HashMap<>();
        this.corequisites = new HashMap<>();
        this.semesters = semesters;
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

    public ArrayList<String> getSemesters() {
        return semesters;
    }

    public void setSemester(ArrayList<String> semesters) {
        this.semesters = semesters;
    }
}
