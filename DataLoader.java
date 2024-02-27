import java.util.ArrayList;

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
}
