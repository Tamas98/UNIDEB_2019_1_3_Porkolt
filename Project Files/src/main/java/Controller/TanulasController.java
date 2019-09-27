package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TanulasController {

        Stage testStage;

    public void handleTestButtonClicked() throws Exception{
        Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Kikerdez.fxml"));
        testStage = new Stage();
        testStage.setTitle("Új jelszó");
        testStage.setScene(new Scene(parent, 600, 400));
        testStage.show();
    }

}
