import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static ArrayList<Course> getCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try {
            FileReader reader = new FileReader("courses.json");
            JSONArray coursesJSON = (JSONArray) parser.parse(reader);
            for (Object o : coursesJSON) {
                JSONObject courseJSON = (JSONObject) o;
                String uuid = (String) courseJSON.get("uuid");
                String subject = (String) courseJSON.get("subject");
                String number = (String) courseJSON.get("number");
                String name = (String) courseJSON.get("name");
                String description = (String) courseJSON.get("description");
                double creditHours = Double.parseDouble(courseJSON.get("credit_hours").toString());
                JSONArray semestersJSON = (JSONArray) courseJSON.get("semesters");
                List<String> semesters = new ArrayList<String>();
                for (Object semester : semestersJSON) {
                    semesters.add((String) semester);
                }

                List<Map<String, Object>> prerequisites = new ArrayList<Map<String, Object>>();
                parseRequirements((JSONArray) courseJSON.get("prerequisites"), prerequisites);

                List<Map<String, Object>> corequisites = new ArrayList<Map<String, Object>>();
                parseRequirements((JSONArray) courseJSON.get("corequisites"), corequisites);

                Course course = new Course(uuid, subject, number, name, description, creditHours, semesters,
                        prerequisites, corequisites);
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
