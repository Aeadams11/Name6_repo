import java.util.HashMap;
import java.util.Map;

public abstract class User {
    protected String userID;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected boolean permission;
    protected UserType type;

    public enum UserType {
        STUDENT,
        ADMIN,
        LEGAL_GUARDIAN,
    }

    private static Map<String, User> users = new HashMap<>();

    // default
    public User() {

    }
    public User(String userID, String firstName, String lastName, String email, String password, boolean permission, UserType type) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.permission = permission;
        this.type = type; 
    }

    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isPermission() {
        return permission;
    }

    public abstract UserType getUserType(); // Made abstract to force subclasses to implement

    public boolean setUserID(String userID) {
        // TODO: method to return true if userID is valid
        this.userID = userID;
        return true; 
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract boolean setEmail(String email); 

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    // Common methods for login, logout, forgotPassword
    public static boolean login(String username, String password) {
        // create new user instance
        return true;
    }

    public static boolean logout(){
        // remove user instance
        return true;
    }
    public static void forgotPassword(){
        // idk how to do this method 
    }
}
