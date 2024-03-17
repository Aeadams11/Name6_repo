import java.util.HashMap;
import java.util.Map;

class User {
    private String userID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean permission;

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

    public static boolean login(String username, String password) {
        // Here we would typically check against some database or stored user credentials
        // For simplicity, let's assume a hardcoded username and password
        String validUsername = "exampleUser";
        String validPassword = "examplePassword";

        // Check if the provided username and password match the valid credentials
        if (username.equals(validUsername) && password.equals(validPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
