import java.util.ArrayList;

public class Student extends User {

    public Student(String userID, String firstName, String lastName, String email, String password,
            boolean permission) {
        super(userID, firstName, lastName, email, password, permission);
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

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean hasScholarship() {
        return Scholarship;
    }

    public void setScholarship(boolean Scholarship) {
        this.Scholarship = Scholarship;
    }

    public boolean passedPreReqs() {
        return true;
    }

    public ArrayList<Grade> getCoursesTaken() {
        return coursesTaken;
    }

    public String getmajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public User.UserType getUserType() {
        return UserType.STUDENT;
    }

}
