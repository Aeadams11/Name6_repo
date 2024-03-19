package javafiles;
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
        if (!requiredCourses.contains(course)) {
            requiredCourses.add(course);
        }
    }

    public void addElectiveCourse(Course course) {
        if (!electiveCourses.contains(course)) {
            electiveCourses.add(course);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getRequiredCourses() {
        return new ArrayList<>(requiredCourses);
    }

    public ArrayList<Course> getElectiveCourses() {
        return new ArrayList<>(electiveCourses);
    }

    // Logic to remove courses, calculate progress, or any other needed functionality
}