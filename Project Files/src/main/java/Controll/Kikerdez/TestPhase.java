package Controll.Kikerdez;

import Controller.TanulasController;

import java.util.HashMap;
import java.util.Map;

public class TestPhase implements Test {

    private Map<String,String> allWord = TanulasController.language;

    private Map<String,Integer> was = new HashMap<>();

    public static  Map<String,String> learned = new HashMap<>();

    public Map<String, String> getLearned() {
        return null;
    }

    private boolean checkCorrect(String key, String value){

        if(allWord.containsKey(key.toLowerCase())){
            return allWord.get(key.toLowerCase()) == value.toLowerCase();
        }else{
            return false;
        }

    }

    public String checkAnswer(String key,String value){

        checkAndAdd(key,value);

        for(Map.Entry<String,Integer> entry: was.entrySet()){
            System.out.println("Key: " + entry.getKey() + "\nValue: " +entry.getValue() + "\n");
        }


        return null;

    }

    private void checkAndAdd(String key,String value){

        if(was.containsKey(key)){

            Object o = (checkCorrect(key,value)) ? was.put(key,was.get(key)+1) : null;

            o = (was.get(key) == 2) ? learned.put(key,value) : null;

        }else{

            Object o = (checkCorrect(key,value)) ? was.put(key,1) : was.put(key,0);

        }

    }

}
