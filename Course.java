import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseName;
    // hashmap?
    private ArrayList<Course> preReqs;
    private char minGrade;
    private String department;

<<<<<<< HEAD
    public Course(String courseID, String courseName, String requirements, char minimumGrade, String department) {
        this.courseID = courseID;
        this.courseName = courseName;
        
=======
    public Course(String courseID, String courseName, char minimumGrade, String department) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.minGrade = minimumGrade;
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

    public ArrayList<Course> getPreReqs() {
        return preReqs;
    }

    public void setPreReqs(ArrayList<Course> preReqs) {
        this.preReqs = preReqs;
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
>>>>>>> bfb067de0cafb87760a647e04f0562fa2d07d0af
    }

}
