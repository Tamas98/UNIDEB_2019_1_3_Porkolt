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

    private String caesarCoder(String passwd) {
        return "Hy";
    }

    @Override
    public String deCoder(String passwd) {
        return null;
    }
}
