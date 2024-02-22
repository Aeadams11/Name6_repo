public abstract class User {
    protected String userID;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected boolean permission;

    // Common methods for login, logout, forgotPassword
}

public class Student extends User {
    // Student-specific attributes and methods
}

public class Advisor extends User {
    // Advisor-specific attributes and methods
}

public class Admin extends User {
    // Admin-specific attributes and methods
}
