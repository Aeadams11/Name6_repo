package javafiles;

public class UniversitySystemFACADE {
    private UserList userList; 

    public UniversitySystemFACADE(UserList userList) {
        this.userList = userList;
    }

    public User login(String USCID, String password) {
        // Assuming USCID is equivalent to username
        User user = userList.getUser(USCID); // Pass USCID as argument to getUser method
        if (user != null && user.getPassword().equals(password)) {
            return user; // User found and password matches
        } else {
            return null; // User not found or password does not match
        }
    }
}
