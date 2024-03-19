package javafiles;

import java.util.HashMap;

public class Course {
    private String courseID;
    private String courseName;
    private HashMap<String, Course> prerequisites;
    private int credits; // Adding credits attribute

    // Constructor
    public Course(String courseID, String courseName, int credits) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.prerequisites = new HashMap<>();
        this.credits = credits;
    }

    // Method to add a prerequisite course
    public void addPrerequisite(String preReqID, Course course) {
        prerequisites.put(preReqID, course);
    }

    // Getter for courseID
    public String getCourseID() {
        return courseID;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Getter for prerequisites
    public HashMap<String, Course> getPrerequisites() {
        return prerequisites;
    }

    // Getter for credits
    public int getCredits() {
        return credits;
    }
}

