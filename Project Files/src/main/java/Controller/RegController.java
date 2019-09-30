package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RegController {


    Stage regStage;
    public Button okButt;

    public void handleChangeButtonClicked() throws Exception{

        Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Udvozlo.fxml"));
        regStage = new Stage();
        regStage.setTitle("Kezdőképernyő");
        regStage.setScene(new Scene(parent, 600, 400));
        regStage.show();

    }

    public void changeButtonColor() {
        if (okButt.isHover()) {
            okButt.setStyle("-fx-background-color: #b9865d");
        }
    }

    public void changeBackColor() {
        okButt.setStyle("-fx-background-color: #696969");
    }

}
