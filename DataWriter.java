import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject; 

public class DataWriter {
    
    public static void saveUsers() {
        //Users users = Users.getInstance();
        ArrayList<User> userList = users.getUsers(); //users.JSON
        JSONArray jsonUsers = new JSONArray();

        //creating all the json objects
        for(int i=0; i < userList.size(); i++){
            jsonUsers.add(getUserJSON(userList.get(i)));
        }

        //write JSON file
        try (FileWriter file = new FileWriter("file name here")) {
            file.write(jsonUsers.toJSONString());
            file.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Super duper unfinished!
    public static JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(USERID, user.getID().toString());
        userDetails.put(username, user.getUserName());
        userDetails.put(firstName, user.getFirstName());
        userDetails.put(lastName, user.getLastName());
        userDetails.put(email, user.getEmail());

        return userDetails; 
    }













    // Assuming you have access to current lists of users and courses somewhere in your application
    private ArrayList<User> users;
    private ArrayList<Course> courses;
    
    public DataWriter(ArrayList<User> users, ArrayList<Course> courses) {
        this.users = users;
        this.courses = courses;
    }

    // Simulates saving users to a data source
    public void saveUsers() {
        // In a real application, insert database or file writing logic here
        for (User user : users) {
            System.out.println("Saving user: " + user.toString());
        }
    }

    // Simulates saving courses to a data source
    public void saveCourses() {
        // In a real application, insert database or file writing logic here
        for (Course course : courses) {
            System.out.println("Saving course: " + course.toString());
        }
    }
}
