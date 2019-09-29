package Controller;

import Controll.Kikerdez.TestPhase;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import com.google.gson.reflect.TypeToken;
import Controll.fileHandler.JsonReader;
import Controll.fileHandler.ReadFile;
import javafx.scene.control.TextField;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import Controll.Learning.LearningMethod;

public class KikerdezController extends TestPhase implements Initializable {

    private Type token = new TypeToken<Map<String, String>>(){}.getType();

    private ReadFile jsonReader = new JsonReader("/Assets/exercises.json",token);

    @FXML
    public Button nextButt,quitButt;

    @FXML
    public TextField askedOne,anotherOne;

    public void changeButtonColor() {
        if (nextButt.isHover()) {
            nextButt.setStyle("-fx-background-color: #b9865d");
        } else {
            quitButt.setStyle("-fx-background-color: #b9865d");
        }
    }

    public void changeBackColor() {
        nextButt.setStyle("-fx-background-color: #696969");
        quitButt.setStyle("-fx-background-color: #696969");
    }

    public void quitButtClicked() throws Exception {
        System.exit(0);
    }

    @FXML
    public void checkAnsw(){
        checkAnswer(askedOne.getText(),anotherOne.getText());
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Random random = new Random();
       // String starter = LearningMethod.FinalMap.keySet().stream().collect(Collectors.toList()).get(random.nextInt(10));

       // anotherOne.setText(starter);

    }



}
