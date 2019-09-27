package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UdvozloController {

    Stage newPassStage, chooseStage;
    public Button newPassButt, signIn;

    public void handleNewPassButtonClicked() throws Exception{
        Parent newPassword = FXMLLoader.load(getClass().getResource("/fxml/Uj_jelszo.fxml"));
        newPassStage = new Stage();
        newPassStage.setTitle("Új jelszó");
        newPassStage.setScene(new Scene(newPassword, 600, 200));
        newPassStage.show();
    }


    public void handleLogInButtonClicked() throws Exception{
        newPassStage.close();
        Parent nxtWindow = FXMLLoader.load(getClass().getResource("/fxml/Nyelvvalasztas.fxml"));
        chooseStage = new Stage();
        chooseStage.setTitle("Választható nyelvek");
        chooseStage.setScene(new Scene(nxtWindow, 600, 400));
        chooseStage.show();

    }




}
