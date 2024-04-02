import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader {

    public static ArrayList<User> getStudents(String fileName) {
        ArrayList<User> students = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader(fileName);
            JSONArray studentsJSON = (JSONArray) parser.parse(reader);
            for (Object o : studentsJSON) {
                JSONObject studentJSON = (JSONObject) o;

                String uscID = (String) studentJSON.get("uscID");
                String firstName = (String) studentJSON.get("firstName");
                String lastName = (String) studentJSON.get("lastName");
                String email = (String) studentJSON.get("email");
                String password = (String) studentJSON.get("password");
                String major = (String) studentJSON.get("major");
                String advisorID = (String) studentJSON.get("advisorId");

                JSONArray coursesTakenJSON = (JSONArray) studentJSON.get("coursesTaken");
                ArrayList<String> coursesTaken = new ArrayList<>();
                for (Object course : coursesTakenJSON) {
                    coursesTaken.add((String) course);
                }

                JSONArray currentCoursesJSON = (JSONArray) studentJSON.get("currentSemesterCourses");
                ArrayList<String> currentCourses = new ArrayList<>();
                for (Object course : currentCoursesJSON) {
                    currentCourses.add((String) course);
                }

                JSONArray gradesJSON = (JSONArray) studentJSON.get("grade");
                String[] grades = new String[gradesJSON.size()];
                for (int i = 0; i < gradesJSON.size(); i++) {
                    grades[i] = (String) gradesJSON.get(i);
                }

                String typeStr = (String) studentJSON.get("type");
                User.UserType type = User.UserType.valueOf(typeStr.toUpperCase());

                Student student = new Student(uscID, firstName, lastName, email, password, major, advisorID,
                        coursesTaken, currentCourses, grades, false, type);

                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static ArrayList<User> getFaculty(String filename) {
        ArrayList<User> facultyMembers = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader(filename);
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

    // private static Student parseStudent(JSONObject userJSON) {
    // return new Student(
    // (String) userJSON.get("uscID"),
    // (String) userJSON.get("firstName"),
    // (String) userJSON.get("lastName"),
    // (String) userJSON.get("email"),
    // (String) userJSON.get("password"),
    // true);
    // }

    // private static Admin parseFaculty(JSONObject userJSON) {
    // return new Admin(
    // (String) userJSON.get("facultyId"),
    // (String) userJSON.get("firstName"),
    // (String) userJSON.get("lastName"),
    // (String) userJSON.get("email"),
    // "password",
    // true);
    // } commenting out for

    public static ArrayList<Course> getCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try {
            FileReader reader = new FileReader("Courses.json");
            JSONArray coursesJSON = (JSONArray) parser.parse(reader);
            for (Object o : coursesJSON) {
                JSONObject courseJSON = (JSONObject) o;
                String courseID = (String) courseJSON.get("uuid");
                String subject = (String) courseJSON.get("subject");
                int number = Integer.parseInt((String) courseJSON.get("number"));
                String courseName = (String) courseJSON.get("name");
                String description = (String) courseJSON.get("description");
                //String instructor = "Default Instructor";
                //String meetingTime = "TBA";
                int creditHours = Integer.parseInt((String) courseJSON.get("credit_hours"));
                JSONArray semestersJSON = (JSONArray) courseJSON.get("semesters");
                String semester = semestersJSON.isEmpty() ? "Unspecified" : (String) semestersJSON.get(0);
                String[] semesters = (String[]) courseJSON.get("semesters"); 
                //pre and co reqs
                Course course = new Course(courseID, courseName, description, semesters, creditHours,
                        );
                courses.add(course);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;
    }

    private static void parseRequirements(JSONArray requirementsJSON, List<Map<String, Object>> requirements) {
        if (requirementsJSON != null) {
            for (Object requirementObj : requirementsJSON) {
                JSONObject requirementJSON = (JSONObject) requirementObj;
                Map<String, Object> requirement = new HashMap<>();
                requirement.put("choices", requirementJSON.get("choices"));
                requirement.put("grade", requirementJSON.get("grade"));

                List<String> options = new ArrayList<>();
                JSONArray optionsJSON = (JSONArray) requirementJSON.get("options");
                for (Object option : optionsJSON) {
                    options.add((String) option);
                }
                requirement.put("options", options);

                requirements.add(requirement);
            }
        }
    }
}
