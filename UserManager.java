import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> users = new HashMap<>();

    public void saveUser(User user) {
        users.put(user.getUserID(), user);
    }

    public User getUser(String userID) {
        return users.get(userID);
    }

    public void deleteUser(String userID) {
        users.remove(userID);
    }

    public Collection<User> getAllUsers() {
        return users.values();
    }

}
