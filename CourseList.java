import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseList {
    private static CourseList instance;
    private Map<String, Course> courses;

    private CourseList() {
        this.courses = new HashMap<>();
    }

    public static CourseList getInstance() {
        if (instance == null) {
            instance = new CourseList();
        }
        return instance;
    }

    public void addCourse(Course course) {
        if (course != null && !courses.containsKey(course.getCourseID())) {
            courses.put(course.getCourseID(), course);
        }
    }

    public Course getCourseByID(String courseID) {
        return courses.get(courseID);
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses.values());
    }

    public boolean removeCourse(String courseID) {
        return courses.remove(courseID) != null;
    }
}
