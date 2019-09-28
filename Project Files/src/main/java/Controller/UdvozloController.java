package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UdvozloController {

    Stage newPassStage, chooseStage;
    public Button newPassButt, signIn, quitButt;
    public AnchorPane udvPane;

    public void handleNewPassButtonClicked() throws Exception{
        Parent newPassword = FXMLLoader.load(getClass().getResource("/fxml/Uj_jelszo.fxml"));
        newPassStage = new Stage();
        newPassStage.setTitle("Kezdőképernyő");
        newPassStage.setScene(new Scene(newPassword, 600, 200));
        newPassStage.show();
    }


    public void handleLogInButtonClicked() throws Exception{
        
        Parent nxtWindow = FXMLLoader.load(getClass().getResource("/fxml/Nyelvvalasztas.fxml"));
        chooseStage = new Stage();
        chooseStage.setTitle("Választható nyelvek");
        chooseStage.setScene(new Scene(nxtWindow, 600, 400));
        chooseStage.show();
        udvPane.setVisible(false);
    }

    public void changeButtonColor(){
        if (signIn.isHover()){
            signIn.setStyle("-fx-background-color: #b9865d");
        }else if (quitButt.isHover()){
            quitButt.setStyle("-fx-background-color: #b9865d");
        }else{
            newPassButt.setStyle("-fx-background-color: #b9865d");
        }
    }

    public void changeBackColor(){
        signIn.setStyle("-fx-background-color: #696969");
        quitButt.setStyle("-fx-background-color: #696969");
        newPassButt.setStyle("-fx-background-color: #696969");
    }

    public void quitButtClicked() throws Exception {
        System.exit(0);
    }

}
