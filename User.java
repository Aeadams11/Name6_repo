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

    public User(String userID, String firstName, String lastName, String email, String password, boolean permission) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.permission = permission;
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

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    // Common methods for login, logout, forgotPassword
    public static boolean login(String username, String password) {
        return true;
    }

    public static boolean logout(){
        return true;
    }
    public static void forgotPassword(){

    }
}
