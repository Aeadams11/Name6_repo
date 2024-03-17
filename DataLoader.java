import java.util.ArrayList;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader {

    public static ArrayList<User> getStudents() {
        ArrayList<User> students = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader("student.json");
            JSONArray studentsJSON = (JSONArray) parser.parse(reader);
            for (Object o : studentsJSON) {
                JSONObject studentJSON = (JSONObject) o;
                User student = parseStudent(studentJSON);
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static ArrayList<User> getFaculty() {
        ArrayList<User> facultyMembers = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader("faculty.json");
            JSONArray facultyJSON = (JSONArray) parser.parse(reader);
            for (Object o : facultyJSON) {
                JSONObject facultyMemberJSON = (JSONObject) o;
                User facultyMember = parseFaculty(facultyMemberJSON);
                facultyMembers.add(facultyMember);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return facultyMembers;
    }

    private static Student parseStudent(JSONObject userJSON) {
        return new Student(
                (String) userJSON.get("uscID"),
                (String) userJSON.get("firstName"),
                (String) userJSON.get("lastName"),
                (String) userJSON.get("email"),
                (String) userJSON.get("password"),
                true);
    }

    private static Admin parseFaculty(JSONObject userJSON) {
        return new Admin(
                (String) userJSON.get("facultyId"),
                (String) userJSON.get("firstName"),
                (String) userJSON.get("lastName"),
                (String) userJSON.get("email"),
                "password",
                true);
    }

}

public static ArrayList<Course> getCourses() {
    ArrayList<Course> courses = new ArrayList<>();
    JSONParser parser = new JSONParser();

    try {
        FileReader reader = new FileReader("courses.json");
        JSONArray coursesJSON = (JSONArray) parser.parse(reader);
        for (Object o : coursesJSON) {
            JSONObject courseJSON = (JSONObject) o;
            String courseID = (String) courseJSON.get("courseID");
            String courseName = (String) courseJSON.get("courseName");
            String description = (String) courseJSON.get("description");
            String instructor = (String) courseJSON.get("instructor");
            String meetingTime = (String) courseJSON.get("meetingTime");
            int creditHours = ((Long) courseJSON.get("creditHours")).intValue();
            char minGrade = ((String) courseJSON.get("minGrade")).charAt(0);
            String department = (String) courseJSON.get("department");
            Course course = new Course(courseID, courseName, description, instructor, meetingTime, creditHours,
                    minGrade, department);
            courses.add(course);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return courses;
}
