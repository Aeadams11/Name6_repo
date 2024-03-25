import java.util.ArrayList;
import java.util.Scanner;
public class Admin extends User {
    
    static Scanner keyboard = new Scanner(System.in); 

    // lets make a role enum
    private String role;
    // department should also be an enum
    private String department;
    // what is this: 
    private int accessLevel;
    // what is this: 
    private ArrayList<String> assignedSections;
    private static ArrayList<Student> advisees;
    private StudentList completeStudentList; // will prob need to initialize this

    public Admin(String userID, String firstName, String lastName, String email, String password, boolean permission, UserType type) {
        super(userID, firstName, lastName, email, password, permission, type);
        // what is assigned sections? 
        this.assignedSections = new ArrayList<>();
        Admin.advisees = new ArrayList<Student>();
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
        advisees.add(advisee);
    }

    public void removeAdvisee(Student advisee) {
        advisees.remove(advisee);
    }

    public User createUserAcc(String userID) {
        // do we want to return a user? or just a boolean? or void? 
        return null;
    }

    public boolean deleteUserAcc(String userID) {
        // how? delete from User ArrayList? 
        return true;
    }

    public boolean resetUserPass(String userID, String newPassword) {
        // im thinking we scrap this method - same reason as below
        return true;
    }

    public int assignUserRole(String userID, String role) {
        // idk if we need this method. feels like too much. 
        return 0;
    }

    public void generateReport(String userID) {
        // this should just call the students report method
    }

    public Student searchUser(String id) {
        Student found = completeStudentList.getUser(id);
        return found;
    }

    public User.UserType getUserType() {
        return UserType.ADMIN;
    }

    public void addAdvisee(String studentID) {
        advisees.add(searchUser(studentID));
        searchUser(studentID).setAdvisor(this);
    }
    public void addNote(String studentID) {
        Student student = completeStudentList.getUser(studentID);
        String note = keyboard.nextLine();
        student.advisorNotes += note; 
        System.out.println("note successfully added.");
    }
}
