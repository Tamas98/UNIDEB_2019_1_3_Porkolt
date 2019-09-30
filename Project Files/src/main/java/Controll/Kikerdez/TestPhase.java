package Controll.Kikerdez;

import Controller.KikerdezController;
import Controller.TanulasController;
import javafx.scene.text.Text;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestPhase implements Test {

    private Map<String,String> allWord = TanulasController.language;

    private Map<String,Integer> was = new HashMap<>();

    public static  Map<String,String> learned = new HashMap<>();

    public Map<String, String> getLearned() {
        return null;
    }

    private boolean checkCorrect(String key, String value){
        if(allWord.containsKey(key.toLowerCase())){
            return allWord.get(key.toLowerCase()).equals(value.toLowerCase());
        }else{
            return false;
        }

    }

    public void checkAnswer(String key,String value,Text helyes){
        checkAndAdd(key,value,helyes);
    }

    private void checkAndAdd(String key,String value,Text helyes){

        if(was.containsKey(key)){

           if(checkCorrect(key,value)) {
               was.put(key, was.get(key) + 1);
               setOnShit(key,value,helyes);
           }

            if(was.get(key) == 2)
                learned.put(key,allWord.get(key));

        }else{
            if(checkCorrect(key,value)) {
                was.put(key, 1);
                setOnShit(key,value,helyes);
            }
            else {
                was.put(key, 0);
                setOnShit(key,value, helyes);
            }
        }

    }

    private void setOnShit(String key,String value, Text toSet){
        if(checkCorrect(key,value)){
            toSet.setText("Helyes válasz");
        }else{
            if(allWord.containsKey(key))
                toSet.setText("Helytelen válasz, helyes válasz: \n" + key + " - " + allWord.get(key));
            else
                toSet.setText("Helytelen válasz, helyes válasz: \n" + allWord.keySet().stream().filter(k -> allWord.get(k).equals(value)).collect(Collectors.toList()).get(0) + " - " + value);
        }
    }

}
