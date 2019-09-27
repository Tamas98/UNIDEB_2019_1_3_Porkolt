package Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Uj_jelszoController {

    Stage newPassStage;
    public Button changeButt;

    public void handleChangeButtonClicked() throws Exception{

        Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Udvozlo.fxml"));
        newPassStage = new Stage();
        newPassStage.setTitle("Új jelszó");
        newPassStage.setScene(new Scene(parent, 600, 400));
        newPassStage.show();

    }


}
