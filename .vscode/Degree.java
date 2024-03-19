package javafiles;
import java.util.ArrayList;

public class Degree {
    private String degreeName;
    private int requiredCredits;
    private ArrayList<Course> coreCourses;
    private ArrayList<Course> electiveCourses;

    // Constructor
    public Degree(String degreeName, int requiredCredits) {
        this.degreeName = degreeName;
        this.requiredCredits = requiredCredits;
        this.coreCourses = new ArrayList<>();
        this.electiveCourses = new ArrayList<>();
    }

    // Add a core course to the degree
    public void addCoreCourse(Course course) {
        coreCourses.add(course);
    }

    // Add an elective course to the degree
    public void addElectiveCourse(Course course) {
        electiveCourses.add(course);
    }

    // Getters
    public String getDegreeName() {
        return degreeName;
    }

    public int getRequiredCredits() {
        return requiredCredits;
    }

    public ArrayList<Course> getCoreCourses() {
        return new ArrayList<>(coreCourses);
    }

    public ArrayList<Course> getElectiveCourses() {
        return new ArrayList<>(electiveCourses);
    }

    // Method to remove a course (either core or elective)
    public boolean removeCourse(String courseID) {
        return coreCourses.removeIf(course -> course.getCourseID().equals(courseID)) || 
               electiveCourses.removeIf(course -> course.getCourseID().equals(courseID));
    }

    // Additional methods can be implemented as needed
}
