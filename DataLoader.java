import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class DataLoader { // extends DataWriter{

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        JSONParser parser = new JSONParser();

        try {
            FileReader reader = new FileReader("users.json"); // Correct file name
            JSONArray userJSON = (JSONArray) parser.parse(reader);

            for (int i = 0; i < userJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) userJSON.get(i);
                String USCID = (String) personJSON.get("USCID");
                String firstName = (String) personJSON.get("firstName");
                String lastName = (String) personJSON.get("lastName");
                String password = (String) personJSON.get("password");
                String email = (String) personJSON.get("email");
                boolean permission = (Boolean) personJSON.get("permission");
                Student user = new Student(USCID, firstName, lastName, password, email, permission);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
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
