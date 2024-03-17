import java.util.ArrayList;

public class Major {
    private String name;
    private ArrayList<Course> requiredCourses;
    private ArrayList<Course> electiveCourses;

    public Major(String name) {
        this.name = name;
        this.requiredCourses = new ArrayList<>();
        this.electiveCourses = new ArrayList<>();
    }

    public void addRequiredCourse(Course course) {
        this.requiredCourses.add(course);
    }

    public void addElectiveCourse(Course course) {
        this.electiveCourses.add(course);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getRequiredCourses() {
        return new ArrayList<>(this.requiredCourses);
    }

    public ArrayList<Course> getElectiveCourses() {
        return new ArrayList<>(this.electiveCourses);
    }
}
