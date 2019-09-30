import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("fxml/Udvozlo.fxml"));
<<<<<<< HEAD
        Main.stage.setTitle("Nyelvtanulás");
        Main.stage.setScene(new Scene(root, 600, 400));
        Main.stage.show();
=======
        primaryStage.setTitle("Nyelvtanulás");
        primaryStage.getIcons().add(new Image("/Pictures/Icon.png"));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
>>>>>>> 9a6c5fc7751b159884991506616a52fa8803c4f6
    }
}
