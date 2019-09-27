package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NyelvvController {

    Stage learnStage;

    public void handleFlagImageClicked() throws Exception{
        Parent learn = FXMLLoader.load(getClass().getResource("/fxml/Tanulas.fxml"));
        learnStage = new Stage();
        learnStage.setTitle("Új jelszó");
        learnStage.setScene(new Scene(learn, 600, 400));
        learnStage.show();
    }
}
