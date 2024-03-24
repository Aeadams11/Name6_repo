import java.util.ArrayList;

public class Student extends User {

    public Student(String userID, String firstName, String lastName, String email, String password, String major, String adID, ArrayList<String> coursesTaken, ArrayList<String> currentCourse, String[] grades, String type, boolean permission) {
        super(userID, firstName, lastName, email, password, permission, type);
    }

    private String firstname;
    private String lastname;
    private int age;
    private String StudentID;
    private String email;
    private boolean Scholarship;
    public static ArrayList<Grade> coursesTaken;
    private String major;
    public static String advisorNotes = "";
    public ApplicationArea.Areas appArea = ApplicationArea.Areas.NONE;
    //private Admin advisor; 
    
    public static void displayCoursesTaken() {
        String display = "";
        for (Grade grade : coursesTaken) {
            String course = grade.getCourse().toString();
            char letterGrade = grade.getGrade();
            // later: check if passed
            display += "Course: " + course + "Grade: " + letterGrade + " ** PASSED **";
        }
        System.out.println(display);
    }
    public String displayInfo(){
        return firstName + " " + lastName + "\nEmail: " + email + "\nMajor: " + major + "Application Area "+ 
        appArea + "\nAdvisor Notes: " + advisorNotes;
        //+ "Advisor: "+ advisor.firstName + " " + advisor.lastName 
    }
    public String getName() {
        return firstname + lastname;
    }

    public void setName(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        //check email format
        if(email.contains("@email.sc.edu")){
            this.email = email;
            return true; 
        }
        else
            return false; 
    }

    public boolean hasScholarship() {
        return Scholarship;
    }

    public void setScholarship(boolean Scholarship) {
        this.Scholarship = Scholarship;
    }

    public boolean passedPreReqs() {
        // why is this under student? passed preReqs for what course? 
        return true;
    }

    public ArrayList<Grade> getCoursesTaken() {
        return coursesTaken;
    }

    public String getmajor() {
        return major;
    }

    public boolean setMajor(String major) {
        // ensure that major is acceptable
        // enum for majors? 
        this.major = major;
        return true;
    }

    public User.UserType getUserType() {
        return UserType.STUDENT;
    }
    public static String getAdvisorNotes() {
        return advisorNotes;
    }
    public static void setAdvisorNotes(String advisorNotes) {
        Student.advisorNotes = advisorNotes;
    }
    public ApplicationArea.Areas getAppArea() {
        return appArea;
    }
    public void setAppArea(ApplicationArea.Areas appArea) {
        this.appArea = appArea;
    }
    // public Admin getAdvisor() {
    //     return advisor;
    // }
    // public void setAdvisor(Admin advisor) {
    //     this.advisor = advisor;
    // }
}
