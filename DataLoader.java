import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap; 
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader {
    public static Map<String, User> getUsers() {
        Map<String, User> users = new HashMap<>(); 
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader("users.json");
            JSONArray usersJSON = (JSONArray) parser.parse(reader);
            for (Object o : usersJSON) {
                JSONObject userJSON = (JSONObject) o;
                User user = parseUser(userJSON);
                users.put(user.getUserID(), user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    private static User parseUser(JSONObject userJSON) {
        
        String userID = (String) userJSON.get("userID");
        String firstName = (String) userJSON.get("firstName");
        String lastName = (String) userJSON.get("lastName");
        String email = (String) userJSON.get("email");
        String password = (String) userJSON.get("password");
        boolean permission = (boolean) userJSON.get("permission");
        return new User(userID, firstName, lastName, email, password, permission);
    }
}
