import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("fxml/Udvozlo.fxml"));
        Main.stage.setTitle("Nyelvtanulás");
        Main.stage.setScene(new Scene(root, 600, 400));
        Main.stage.show();
    }
}
