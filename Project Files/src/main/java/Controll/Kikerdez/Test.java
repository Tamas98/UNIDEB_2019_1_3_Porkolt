package Controll.Kikerdez;

import javafx.scene.text.Text;

import java.util.Map;

public interface Test {

    Map<String,String> getLearned();

    void checkAnswer(String key, String value, Text toSet);

}
