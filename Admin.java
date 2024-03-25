import java.util.ArrayList;

public class Admin extends User {

    private String role;
    private String department;
    private int accessLevel;
    private ArrayList<String> assignedSections;

    public Admin(String userID, String firstName, String lastName, String email, String password, boolean permission) {
        super(userID, firstName, lastName, email, password, permission);
    }

    public User createUserAcc(String userID) {
     
        return null; 
    }

    public boolean deleteUserAcc(String userID) {
        
        return true;
    }

    public boolean resetUserPass(String userID, String newPassword) {
       
        return true; 
    }

    public int assignUserRole(String userID, String role) {
      
        return 0; 
    }

<<<<<<< Updated upstream
    public Report generateReport(String userID) {
        
        return null; 
    }
=======

>>>>>>> Stashed changes
}
