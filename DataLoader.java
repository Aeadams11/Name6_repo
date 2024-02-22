import java.util.ArrayList;

public class DataLoader {
    // Example method to simulate retrieving courses from a data source
    public ArrayList<Course> getCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        // Simulate adding courses. In a real scenario, you would fetch this data from a database or file.
        courses.add(new Course("CS101", "Introduction to Computer Science", "Basics of computer science", 'C', "Computer Science"));
        courses.add(new Course("MATH201", "Calculus I", "Differential calculus", 'B', "Mathematics"));
        // Add more courses as needed
        return courses;
    }

    // Example method to simulate retrieving users from a data source
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        // Simulate adding users. In a real scenario, you would fetch this data from a database or file.
        users.add(new Student("123456", "John", "Doe", "john.doe@example.com", "password123", false, "CS101"));
        users.add(new Advisor("789012", "Jane", "Smith", "jane.smith@example.com", "password456", true, "Computer Science"));
        // Add more users as needed
        return users;
    }
}
