package javafiles;

import java.util.ArrayList;

public class Advisor extends User {
    private String firstName;
    private String lastName;
    private int facultyID;
    private String email;
    private ArrayList<Student> students;
    private boolean isAdmin; // Indicates whether the advisor is also an admin

    // Constructor
    public Advisor(String userID, String userName, String firstName, String lastName, String email, String password, boolean permission, int facultyID, boolean isAdmin) {
        super(userID, userName, firstName, lastName, email, password, permission); // Call the superclass constructor
        this.facultyID = facultyID;
        this.isAdmin = isAdmin; // Set the value of isAdmin
        this.students = new ArrayList<>();
    }

    // Getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacultyID() {
        return String.valueOf(facultyID);
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getAdvisorFirstName() {
        return firstName;
    }

    public String getAdvisorLastName() {
        return lastName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    // Method to view plans for a student
    public void viewPlans(Student student) {
        System.out.println("Viewing plans for student: " + student.getName());
        // Logic to view plans for the student
        // For example, you could access the student's course plans or degree requirements
        // This is just a placeholder implementation
        System.out.println("Course plans for " + student.getName() + ": " + student.getCoursesTaken());
    }

    // Method to make notes
    public String makeNotes() {
        System.out.println("Making notes");
        // Logic to make notes
        // This is just a placeholder implementation
        return "Notes made";
    }

    // Method to clear a student for graduation
    public boolean clearForGraduation(Student student) {
        if (isAdmin) { // Check if the advisor is an admin
            System.out.println("Clearing student " + student.getName() + " for graduation");
            // Logic to clear a student for graduation
            // This is just a placeholder implementation
            return true; // Placeholder return value
        } else {
            System.out.println("You do not have permission to clear students for graduation.");
            return false;
        }
    }

    // Method to place a hold on a student
    public void placeHold(Student student) {
        if (isAdmin) { // Check if the advisor is an admin
            System.out.println("Placing hold on student " + student.getName());
            // Logic to place a hold on a student
            // This is just a placeholder implementation
        } else {
            System.out.println("You do not have permission to place holds on students.");
        }
    }

    // Method to prove application
    public boolean proveApplication() {
        if (isAdmin) { // Check if the advisor is an admin
            System.out.println("Proving application");
            // Logic to prove application
            // This is just a placeholder implementation
            return true; // Placeholder return value
        } else {
            System.out.println("You do not have permission to prove applications.");
            return false;
        }
    }
}
