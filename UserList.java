import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class UserList {
    private static UserList instance;
    private Map<String, User> users;

    private UserList() {
        users = DataLoader.getUsers(); 
    }

    public static UserList getInstance() {
        if (instance == null) {
            instance = new UserList();
        }
        return instance;
    }

    public boolean haveUser(String userName) {
        return users.containsKey(userName);
    }

    public User getUser(String userName) {
        return users.getOrDefault(userName, null);
    }

    public boolean createUser(String userID, String firstName, String lastName, String email, String password, boolean permission) {
        if (!haveUser(userID)) {
            User newUser = new User(userID, firstName, lastName, email, password, permission);
            users.put(userID, newUser);
            return true;
        }
        return false;
    }

    public boolean updateUser(String userID, String firstName, String lastName, String email, String password, boolean permission) {
        if (haveUser(userID)) {
            User updatedUser = new User(userID, firstName, lastName, email, password, permission);
            users.put(userID, updatedUser);
            return true;
        }
        return false;
    }

    public boolean deleteUser(String userID) {
        if (haveUser(userID)) {
            users.remove(userID);
            return true;
        }
        return false;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }
}
