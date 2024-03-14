import java.util.ArrayList;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader {

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader("users.json");
            JSONArray usersJSON = (JSONArray) parser.parse(reader);
            for (Object o : usersJSON) {
                JSONObject userJSON = (JSONObject) o;
                UserType type = User.UserType.valueOf((String) userJSON.get("type"));
                switch (type) {
                    case User.UserType.STUDENT:
                        users.add(parseStudent(userJSON));
                        break;
                    case User.UserType.ADMIN:
                        users.add(parseFaculty(userJSON));
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown user type: " + type);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
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
        ArrayList<Course> courses = new ArrayList<Course>();

        try {
            FileReader reader = new FileReader("courses.json");
            JSONParser parser = new JSONParser();
            JSONArray coursesJSON = (JSONArray) new JSONParser().parse(reader);

            // edit for course instead of user
            for (Object o : coursesJSON) {
                JSONObject courseJSON = (JSONObject) o;
                String courseID = (String) courseJSON.get("courseID");
                String courseName = (String) courseJSON.get("courseName");
                String description = (String) courseJSON.get("Description");
                String instructor = (String) courseJSON.get("Instructor");
                String meetingTime = (String) courseJSON.get("meetingTime");
                long creditHours = (long) courseJSON.get("creditHours");

                Course course = new Course(courseID, courseName, description, instructor, meetingTime,
                        (int) creditHours);

                return courses;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;

    }
}
