import java.util.ArrayList;

public class SemesterPlan {
    private String semester;
    private ArrayList<Course> courses;
    private String studentID;

    public SemesterPlan(String semester, String studentID) {
        this.semester = semester;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(Course course) {
        // Check if the course is not already in the semester plan
        if (!courses.contains(course)) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public boolean removeCourse(Course course) {
        return courses.remove(course);
    }

    public ArrayList<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int calculateTotalCreditCount() {
        int totalCredits = 0;
        for (Course course : courses) {
            totalCredits += course.getCreditHours();
        }
        return totalCredits;
    }
}