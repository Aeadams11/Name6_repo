import java.util.ArrayList;

public class UserList {
    private static UserList instance;
    private ArrayList<User> users;

    private UserList() {
        users = DataLoader.getUsers();
    }

    public static UserList getInstance() {
        if (instance == null) {
            instance = new UserList();
        }
        return instance;
    }

    public boolean haveUser(String userName) {
        // TODO: loop throuh arraylist, check if user exists
        return true;
    }

    public User getUser(String userName) {
        // check if it exists
        if (!haveUser(userName))
            return null;
        // fake user to info to allow it to compile
        // error: Cannot instantiate the type User
        User anna = new Student(userName, "Anna", "Adams", "aea5@email.sc.edu", "password123", false);
        return anna;
    }

    public static boolean createUser(String userID, String firstName, String lastName, String email, String password, User.UserType type) {
        //create user
        //add to user list 
        //return true if account is successfully created
        return true;   
    }
}
