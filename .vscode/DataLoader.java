package javafiles;

import java.util.ArrayList;

public class DataLoader {
    // Example method to simulate retrieving courses from a data source
    public ArrayList<Course> getCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        // Simulate adding courses. In a real scenario, you would fetch this data from a database or file.
        Course cs101 = new Course("CS101", "Introduction to Computer Science", 3);
        Course math201 = new Course("MATH201", "Calculus I", 4);
        cs101.addPrerequisite("MATH101", math201); // Adding prerequisites
        courses.add(cs101);
        courses.add(math201);
        // Add more courses as needed
        return courses;
    }

    // Example method to simulate retrieving users from a data source
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        // Simulate adding users. In a real scenario, you would fetch this data from a database or file.
      //  users.add(new Student("123456", "John", "Doe", "john.doe@example.com", "password123", false, "CS101"));
        //users.add(new Advisor("789012", "Jane", "Smith", "jane.smith@example.com", "password456", true, "Computer Science"));
        // Add more users as needed
        return users;
    }
}