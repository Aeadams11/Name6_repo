import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader; 

public class DataLoader{ //} extends DataWriter{

    public static ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<User>();

        try{
            FileReader reader = new FileReader("enter file name here");
            JSONParser parser = new JSONParser();
            JSONArray userJSON = (JSONArray)new JSONParser().parse(reader);

            for(int i = 0; i < userJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)userJSON.get(i);
                UUID USCID = UUID.fromString((String)personJSON.get(USC_ID));
                String firstName = (String)personJSON.get(firstName);
                String lastName = (String)personJSON.get(lastName);
                String password = (String)personJSON.get(password);
                String email = (String)personJSON.get(email);
            }

        
        return users;

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getCourses(){
        ArrayList<User> users = new ArrayList<User>();

        try{
            FileReader reader = new FileReader("enter file name here");
            JSONParser parser = new JSONParser();
            JSONArray coursesJSON = (JSONArray)new JSONParser().parse(reader);

            //edit for course instead of user
            for(int i = 0; i < coursesJSON.size(); i++) {
                JSONObject courseJSON = (JSONObject)coursesJSON.get(i);
                UUID USCID = UUID.fromString((String)courseJSON.get(USC_ID));
                String courseCode = (String)courseJSON.get(courseCode);
                String  courseName = (String)courseJSON.get(courseName);
                char minGrade = (char)courseJSON.get(minGrade);
                String department = (String)courseJSON.get(department);
                HashMap preReqs = (HashMap)courseJSON.get(preReqs); 
            }

        
        return users;

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
