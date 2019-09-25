package Controll;

import java.util.Map;

public class TestPhase implements Test {

    public Map<String, String> getLearned() {
        return null;
    }

    public boolean testAnswer(Map<String,String> container,String word) {
        try{

            if(container.containsKey(word)){

            }else{
                container.values().stream().filter(e -> e.equals(word));
            }

            return true;
        }catch(Exception e){
            return false;
        }

    }

}
