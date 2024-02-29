import java.util.ArrayList;

public class Admin extends User {
    private String role;
    private String department;
    private int accessLevel;
    private ArrayList<String> assignedSections;

    public User createUserAcc(UserInfo userInfo) {
        // Implementation
    }

    public boolean deleteUserAcc(String userID) {
        // Implementation
    }

    public boolean resetUserPass(String userID, String newPassword) {
        // Implementation
    }

    public int assignUserRole(String userID, String role) {
        // Implementation
    }

    public Report generateReport(ReportType reportType, ReportParameters parameters) {
        // Implementation
    }
}
