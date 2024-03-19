package javafiles;

import java.util.ArrayList;
import java.util.HashMap;

public class ProgressTracker {
    private String studentID;
    private Degree degreeProgram;
    private ArrayList<Course> completedCourses;
    private HashMap<String, Double> courseGrades; // Maps course ID to grade
    private double currentGPA;

    public ProgressTracker(String studentID, Degree degreeProgram) {
        this.studentID = studentID;
        this.degreeProgram = degreeProgram;
        this.completedCourses = new ArrayList<>();
        this.courseGrades = new HashMap<>();
        this.currentGPA = 0.0;
    }

    public void addCompletedCourse(Course course, double grade) {
        if (!completedCourses.contains(course)) {
            completedCourses.add(course);
            courseGrades.put(course.getCourseID(), grade);
            updateGPA();
        }
    }

    private void updateGPA() {
        double total = 0.0;
        for (double grade : courseGrades.values()) {
            total += grade;
        }
        currentGPA = total / courseGrades.size();
    }

    public ArrayList<Course> getRemainingCourses() {
        ArrayList<Course> remainingCourses = new ArrayList<>(degreeProgram.getCoreCourses());
        remainingCourses.addAll(degreeProgram.getElectiveCourses());
        remainingCourses.removeAll(completedCourses);
        return remainingCourses;
    }

    public double getCurrentGPA() {
        return currentGPA;
    }

    // Additional methods to implement could include checking if degree requirements are met,
    // handling elective courses, and managing semester plans.
}
