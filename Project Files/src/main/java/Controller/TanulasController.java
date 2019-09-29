package Controller;

import Controll.fileHandler.JsonReader;
import Controll.fileHandler.ReadFile;
import com.google.gson.reflect.TypeToken;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class TanulasController implements Initializable {

        public static Map<String,String> language = new HashMap<String,String>();

        private Type token = new TypeToken<Map<String, String>>(){}.getType();

        private ReadFile jsonReader = new JsonReader("/Assets/exercises.json",token);

        Stage testStage;
        public Button prevButt,testButt,nextButt,quitButt;

    public void handleTestButtonClicked() throws Exception{
        Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Kikerdez.fxml"));
        testStage = new Stage();
        testStage.setTitle("Tanulás");
        testStage.setScene(new Scene(parent, 600, 400));
        testStage.show();
    }

    public void changeButtonColor(){
        if (prevButt.isHover()){
            prevButt.setStyle("-fx-background-color: #b9865d");
        }else if (testButt.isHover()){
            testButt.setStyle("-fx-background-color: #b9865d");
        }else if (nextButt.isHover()) {
            nextButt.setStyle("-fx-background-color: #b9865d");
        }else{
            quitButt.setStyle("-fx-background-color: #b9865d");
        }
    }

    public void changeBackColor(){
        prevButt.setStyle("-fx-background-color: #696969");
        testButt.setStyle("-fx-background-color: #696969");
        nextButt.setStyle("-fx-background-color: #696969");
        quitButt.setStyle("-fx-background-color: #696969");
    }

    public void quitButtClicked() throws Exception {
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        language = jsonReader.readFromJson(language);

        if(language == null)
            language = new HashMap<String,String>();
    }

}