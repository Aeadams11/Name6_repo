import java.util.ArrayList;

public class Admin extends User {

    private String role;
    private String department;
    private int accessLevel;
    private ArrayList<String> assignedSections;
    private ArrayList<Student> advisees; 

    public Admin(String userID, String firstName, String lastName, String email, String password, boolean permission) {
        super(userID, firstName, lastName, email, password, permission);
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

    public static Student searchUser(String id){
        //return true if user is found
        return StudentList.getUser(id);
    }

    
    public User.UserType getUserType() {
        return UserType.ADMIN; 
    }

    public void addAdvisee(String studentID) {
        advisees.add(searchUser(studentID));
    }
}
