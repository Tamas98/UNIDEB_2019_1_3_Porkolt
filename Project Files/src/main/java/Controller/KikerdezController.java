package Controller;

import javafx.scene.control.Button;

public class KikerdezController {

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



}
