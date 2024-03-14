import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter {

    private static final String USER_ID = "userID";
    private static final String USERNAME = "username";
    private static final String FIRST_NAME = "firstName";
    private static final String LAST_NAME = "lastName";
    private static final String EMAIL = "email";

    private ArrayList<User> users;
    private ArrayList<Course> courses;

    public DataWriter(ArrayList<User> users, ArrayList<Course> courses) {
        this.users = users;
        this.courses = courses;
    }

    @SuppressWarnings("unchecked")
    public void saveUsersToFile(String fileName) {
        JSONArray jsonUsers = new JSONArray();
        for (User user : users) {
            jsonUsers.add(getUserJSON(user));
        }

        try (FileWriter file = new FileWriter(fileName)) {
            file.write(jsonUsers.toJSONString());
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException("Error while saving users to file", e);
        }
    }

    private static JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(USER_ID, user.getID().toString());
        userDetails.put(USERNAME, user.getUserName());
        userDetails.put(FIRST_NAME, user.getFirstName());
        userDetails.put(LAST_NAME, user.getLastName());
        userDetails.put(EMAIL, user.getEmail());
        return userDetails;
    }

    public void saveCourses() {
        for (Course course : courses) {
            System.out.println("Saving course: " + course.toString());
        }
    }
}
