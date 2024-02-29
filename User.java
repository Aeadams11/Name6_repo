public abstract class User {
    protected String userID;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected boolean permission;

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
    // Common methods for login, logout, forgotPassword
}
