package javafiles;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentID;
    private String email;
    private boolean scholarship;
    private String major; // Assuming Major is a class defined elsewhere
    private ArrayList<Course> coursesTaken;

    // Constructor
    public Student(String firstName, String lastName, int age, String studentID, String email, boolean scholarship, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentID = studentID;
        this.email = email;
        this.scholarship = scholarship;
        this.major = major;
        this.coursesTaken = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean hasScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void addCourseTaken(Course course) {
        coursesTaken.add(course);
    }

    public boolean passedPreReqs() {
        // Logic to check if the student has passed prerequisites for their courses
        // Implementation depends on your requirements
        return true; // Placeholder return value
    }
}
