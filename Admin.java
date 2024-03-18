import java.util.ArrayList;

public class Admin extends User {

    private String role;
    private String department;
    private int accessLevel;
    private ArrayList<String> assignedSections;
    private static ArrayList<Student> advisees;

    public Admin(String userID, String firstName, String lastName, String email, String password, boolean permission) {
        super(userID, firstName, lastName, email, password, permission);
        this.assignedSections = new ArrayList<>();
        Admin.advisees = new ArrayList<>();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public ArrayList<String> getAssignedSections() {
        return assignedSections;
    }

    public void setAssignedSections(ArrayList<String> assignedSections) {
        this.assignedSections = assignedSections;
    }

    public void addAssignedSection(String section) {
        this.assignedSections.add(section);
    }

    public void removeAssignedSection(String section) {
        this.assignedSections.remove(section);
    }

    public ArrayList<Student> getAdvisees() {
        return advisees;
    }

    public void addAdvisee(Student advisee) {
        Admin.advisees.add(advisee);
    }

    public void removeAdvisee(Student advisee) {
        Admin.advisees.remove(advisee);
    }

    public User createUserAcc(String userID) {
        // Implementation
        return null;
    }

    public boolean deleteUserAcc(String userID) {
        // Implementation
        return true;
    }

    public boolean resetUserPass(String userID, String newPassword) {
        // Implementation
        return true;
    }

    public int assignUserRole(String userID, String role) {
        // Implementation
        return 0;
    }

    public Report generateReport(String userID) {
        // Implementation
        return null;
    }

    public static Student searchUser(String id) {
        // return true if user is found
        return StudentList.getUser(id);
    }

    public User.UserType getUserType() {
        return UserType.ADMIN;
    }

    public static void addAdvisee(String studentID) {
        advisees.add(searchUser(studentID));
    }
}
