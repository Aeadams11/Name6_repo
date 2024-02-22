public class UniversitySystemFACADE {
    private UserList userList; // Assuming UserList is a class that holds all users

    public UniversitySystemFACADE(UserList userList) {
        this.userList = userList;
    }

    public User login(String USCID, String password) {
        for (User user : userList.getUsers()) { // Assuming getUsers() returns a collection of User objects
            if (user.getUserID().equals(USCID) && user.getPassword().equals(password)) {
                return user; // User found and password matches
            }
        }
        return null; // User not found or password does not match
    }
}
