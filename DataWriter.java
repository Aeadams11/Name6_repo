import java.util.ArrayList;

public class DataWriter {
    
    // Assuming you have access to current lists of users and courses somewhere in your application
    private ArrayList<User> users;
    private ArrayList<Course> courses;
    
    public DataWriter(ArrayList<User> users, ArrayList<Course> courses) {
        this.users = users;
        this.courses = courses;
    }

    // Simulates saving users to a data source
    public void saveUsers() {
        // In a real application, insert database or file writing logic here
        for (User user : users) {
            System.out.println("Saving user: " + user.toString());
        }
    }

    // Simulates saving courses to a data source
    public void saveCourses() {
        // In a real application, insert database or file writing logic here
        for (Course course : courses) {
            System.out.println("Saving course: " + course.toString());
        }
    }
}
