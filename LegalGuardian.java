import java.util.ArrayList;

public class LegalGuardian extends Student {
    public LegalGuardian(String userID, String firstName, String lastName, String email, String password,
            boolean permission, UserType type) {
            super(userID, firstName, lastName, email, password, email, password, null, null, null, permission, type);
    }

    private String firstName;
    private String lastName;
    private boolean permission;
    private String email; 
    // ArrayList to hold student(s) they are legal guardian of
    private ArrayList<Student> students; 

    public String getFirstName() {
        return this.firstName; 
    }       

    public String getLastName() {
        return this.lastName;
    }

    public boolean setEmail(String email) {
        //return true if email has @
        //idk how else to check is email is valid for any email
        if(email.contains("@")){
            this.email = email;
            return true; 
        }
        else   
            return false; 
    }
    public void addStudent(Student student) {
        //return true if student has permission
        //pass in a student, if that student has permissions set to true
        //then add that student to their array list of students
    }

    public String viewStudentReport() {
        return "Your student's report"; 
    }

    public String viewStudentProfile() {
        return "Your student's profile"; 
    }
}
