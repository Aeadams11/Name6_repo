import java.util.ArrayList;

public class StudentList {
    private static StudentList instance;
    private ArrayList<User> users;

    private StudentList() {
        users = DataLoader.getStudents();
    }

    public static StudentList getInstance() {
        if (instance == null) {
            instance = new StudentList();
        }
        return instance;
    }

    public static boolean haveUser(String userName) {
        // TODO: loop throuh arraylist, check if user exists
        return true;
    }

    public static Student getUser(String userName) {
        // check if it exists
        if (!haveUser(userName))
            return null;
        // fake user to info to allow it to compile
        // error: Cannot instantiate the type User
        Student anna = new Student(userName, "Anna", "Adams", "aea5@email.sc.edu", "password123", false);
        return anna;
    }

    public static boolean createUser(String userID, String firstName, String lastName, String email, String password, User.UserType type) {
        //create user
        //add to user list 
        //return true if account is successfully created
        return true;   
    }
    public ArrayList<User> getUsers() {
        return users; 
    }
    public void removeUser(String userid) {

    }
}
