package Controll.Bejelentkezes;

public class LoginPlease implements Login {

    private String hash1 = "npnpnipibnvajoofa";
    private String hash2 = "phuboanovnipkanvp";

    @Override
    public boolean validatePassword(String passwd) {
        if(passwd.matches("[0..9A..Za..z]*")){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String hasher(String passwd) {
        return hash1+ caesarCoder(passwd) + hash2;
    }
	
	public boolean rightPassword(String passwd, String savedPasswd) {
		if(passwd.equals(hasher(savedPasswd))) {
			return true;
		} else {
			return false;
		}
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
