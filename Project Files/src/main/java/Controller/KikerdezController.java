package Controller;

import Controll.Kikerdez.TestPhase;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import com.google.gson.reflect.TypeToken;
import Controll.fileHandler.JsonReader;
import Controll.fileHandler.ReadFile;
import java.awt.*;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;

public class KikerdezController extends TestPhase implements Initializable {

    private Type token = new TypeToken<Map<String, String>>(){}.getType();

    private ReadFile jsonReader = new JsonReader("/Assets/exercises.json",token);

    public Button nextButt,quitButt;

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


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
