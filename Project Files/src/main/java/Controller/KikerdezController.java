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
import javafx.scene.text.Text;

public class KikerdezController extends TestPhase implements Initializable {

    private Type token = new TypeToken<Map<String, String>>(){}.getType();

    private ReadFile jsonReader = new JsonReader("/Assets/english.json",token);

    private Random random = new Random();

    @FXML
    public Button nextButt,quitButt;

    @FXML
    public Text helyes;

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
    public void checkAnsw() {
        checkAnswer(anotherOne.getText(),askedOne.getText(),helyes);

        anotherOne.setDisable(false);
        askedOne.setDisable(false);

        String nextKey = LearningMethod.fixKeys.get(random.nextInt(10));

        if(random.nextInt(10) < 5){
            anotherOne.setDisable(true);
            anotherOne.setText(nextKey);
            askedOne.setText("");
        }else{
            askedOne.setDisable(true);
            askedOne.setText(LearningMethod.FinalMap.get(nextKey));
            anotherOne.setText("");
        }

        if(TestPhase.learned.size() == 10){
            //Gratuláló popup..vissza a kezdő oldalra.
        }
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

       String starter = LearningMethod.FinalMap.keySet().stream().collect(Collectors.toList()).get(random.nextInt(10));

       anotherOne.setText(starter);
       anotherOne.setDisable(true);

    }



}
