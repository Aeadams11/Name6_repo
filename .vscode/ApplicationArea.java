package javafiles;

import java.util.ArrayList;

public class ApplicationArea {
    private String areaName;
    private ArrayList<Course> requiredCourses;
    private ArrayList<Course> optionalCourses;

    // Constructor
    public ApplicationArea(String areaName) {
        this.areaName = areaName;
        this.requiredCourses = new ArrayList<>();
        this.optionalCourses = new ArrayList<>();
    }

    // List all courses (both required and optional)
    public ArrayList<Course> listCourses() {
        ArrayList<Course> allCourses = new ArrayList<>(requiredCourses);
        allCourses.addAll(optionalCourses);
        return allCourses;
    }

    // Get a description of the application area
    public String getAreaDescription() {
        return "Application Area: " + areaName + ", Required Courses: " + requiredCourses.size() + ", Optional Courses: " + optionalCourses.size();
    }

    // Add a course to the list of required courses
    public void addRequiredCourse(Course course) {
        requiredCourses.add(course);
    }

    // Add a course to the list of optional courses
    public void addOptionalCourse(Course course) {
        optionalCourses.add(course);
    }

    // Remove a course from either required or optional courses by courseID
    public boolean removeCourse(String courseID) {
        return requiredCourses.removeIf(course -> course.getCourseID().equals(courseID)) ||
               optionalCourses.removeIf(course -> course.getCourseID().equals(courseID));
    }
}
