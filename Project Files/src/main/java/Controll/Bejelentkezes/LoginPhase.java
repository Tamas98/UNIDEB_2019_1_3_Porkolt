package Controll.Bejelentkezes;

import Controll.fileHandler.JsonWriter;
import Modell.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LoginPhase implements Login {

    private String hash1 = "npnpnipibnvajoofa";
    private String hash2 = "phuboanovnipkanvp";

    private JsonWriter jsonWriter = new JsonWriter("/Assets/users.json");


    @Override
    public boolean validatePassword(String passwd,String uname,Map<String,User> users) {
        if(passwd.matches("[0-9A-Za-z]*") && !users.containsValue(users.get(hasher(passwd)))){
            User newUser = new User(uname,"0000",new HashMap<String,String>());
            users.put(hasher(passwd),newUser);
            jsonWriter.writeToJson(users);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String hasher(String passwd) {
        return hash1 +  caesarCoder(passwd) + hash2;
    }
	
	public User rightPassword(ArrayList<User> users, String passwd) {

        return null;
	}

    private StringBuffer caesarCoder(String passwd) {
    	int s = 5;
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<passwd.length(); i++) 
        { 
            if (Character.isUpperCase(passwd.charAt(i))) 
            { 
                char ch = (char)(((int)passwd.charAt(i) + 
                                  s - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)passwd.charAt(i) + 
                                  s - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 
        return result;
    }

    @Override
    public String deCoder(String passwd) {
        return null;
    }
}
