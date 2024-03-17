import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter {
    private static final String USER_ID = "userID";
    private static final String FIRST_NAME = "firstName";
    private static final String LAST_NAME = "lastName";
    private static final String EMAIL = "email";
    private static final String PASSWORD = "password";
    private static final String PERMISSION = "permission";

    private Map<String, User> users;

    public DataWriter(Map<String, User> users) {
        this.users = users;
    }

    public void saveUsersToFile(String fileName) {
        JSONArray jsonUsers = new JSONArray();
        for (User user : users.values()) {
            jsonUsers.add(getUserJSON(user));
        }

        try (FileWriter file = new FileWriter(fileName)) {
            file.write(jsonUsers.toJSONString());
            file.flush();
            System.out.println("Users data saved to file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error occurred while saving users to file: " + e.getMessage());
        }
    }

    private JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(USER_ID, user.getUserID());
        userDetails.put(FIRST_NAME, user.getFirstName());
        userDetails.put(LAST_NAME, user.getLastName());
        userDetails.put(EMAIL, user.getEmail());
        userDetails.put(PASSWORD, user.getPassword());
        userDetails.put(PERMISSION, user.isPermission());
        return userDetails;
    }
}

