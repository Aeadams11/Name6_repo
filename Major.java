import java.util.ArrayList;

public abstract class Major {
    private String name;
    private ArrayList<Course> requiredCourses;
    private ArrayList<Course> electiveCourses;


    public Major(String name) {
        this.name = name;
        this.requiredCourses = new ArrayList<Course>();
        this.electiveCourses = new ArrayList<Course>();
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
        return new ArrayList<Course>(this.requiredCourses);
    }

    public ArrayList<Course> getElectiveCourses() {
        return new ArrayList<Course>(this.electiveCourses);
    }
}

