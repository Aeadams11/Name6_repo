import java.util.Map;

public class UniversitySystemFACADE {
    private UserList userList;
    private CourseList courseList;

    public UniversitySystemFACADE() {
        userList = UserList.getInstance();
        courseList = CourseList.getInstance();
    }

    public User login(String USCID, String password) {
        for (User user : userList.getAllUsers()) {
            if (user.getUserID().equals(USCID) && user.getPassword().equals(password)) {
                return user; // User found and password matches
            }
        }
        return null; // User not found or password does not match
    }
}

