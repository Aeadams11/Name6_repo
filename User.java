public abstract class User {
    protected String userID;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected boolean permission;

    public enum UserType {
        STUDENT,
        ADMIN,
        LEGAL_GUARDIAN,
    }

    public User(String userID, String firstName, String lastName, String email, String password, boolean permission) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.permission = permission;
    }

    public User getUser(String userID) {
        // TODO
        return null;
    }

    public UserType getUserType(String userID){
        return null; 
    }
    // Common methods for login, logout, forgotPassword
}
<<<<<<< HEAD


=======
>>>>>>> bfb067de0cafb87760a647e04f0562fa2d07d0af
