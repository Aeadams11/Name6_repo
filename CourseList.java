import java.util.ArrayList;

public class CourseList {
    private ArrayList<Course> courses;

    public CourseList() {
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(Course course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public boolean removeCourse(Course course) {
        return courses.remove(course);
    }

    public Course findCourseByID(String courseID) {
        for (Course course : courses) {
            if (course.getCourseID().equals(courseID)) {
                return course;
            }
        }
        return null;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
