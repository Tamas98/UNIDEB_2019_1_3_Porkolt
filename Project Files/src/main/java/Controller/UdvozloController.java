package Controller;

import Controll.Bejelentkezes.LoginPhase;
import Controll.Languages.adminUser;
import Controll.fileHandler.JsonReader;
import Controll.fileHandler.ReadFile;
import Modell.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.reflect.TypeToken;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
<<<<<<< HEAD
import javafx.scene.layout.VBox;
=======
import javafx.scene.layout.Pane;
>>>>>>> 9a6c5fc7751b159884991506616a52fa8803c4f6
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class UdvozloController extends LoginPhase implements Initializable {

    //private Type token = new TypeToken<Map<String,Map<String,String>>>(){}.getType();
    private Type token = new TypeToken<Map<String,User>>(){}.getType();
    private ReadFile jsonReader = new JsonReader("/Assets/users.json",token);

    //private Map<String,Map<String,String>> users = new HashMap<>();
    public static Map<String,User> users = new HashMap<>();

    Stage newPassStage, regStage, learnStage;
    public Button newPassButt, signIn, quitButt, regButt;
    public AnchorPane udvPane;
    public Pane langPane, signPane;

    @FXML
    public TextField userName;

    @FXML
    public PasswordField passWord;

    public void handleNewPassButtonClicked() throws Exception{
        Parent newPassword = FXMLLoader.load(getClass().getResource("/fxml/Uj_jelszo.fxml"));
<<<<<<< HEAD
        chooseStage = new Stage();
        chooseStage.setTitle("Kezdőképernyő");
        chooseStage.setScene(new Scene(newPassword, 600, 200));
        chooseStage.show();
=======
        newPassStage = new Stage();
        newPassStage.setTitle("Kezdőképernyő");
        newPassStage.setScene(new Scene(newPassword, 600, 200));
        newPassStage.show();
        udvPane.setOpacity(0.1);
>>>>>>> 9a6c5fc7751b159884991506616a52fa8803c4f6
    }

    public void handleLogInButtonClicked() throws Exception{
<<<<<<< HEAD

        String user = "";

        try{
            user = users.keySet().stream().filter(u -> u.equals("admin")? u.equals(passWord.getText()):u.equals(hasher(passWord.getText()))).collect(Collectors.toList()).get(0);
            if(users.get(user).getUsername().equals(userName.getText())){
                Parent nxtWindow = FXMLLoader.load(getClass().getResource("/fxml/Nyelvvalasztas.fxml"));
                Stage langStage = new Stage();
                langStage.setTitle("Választható nyelvek");
                langStage.setScene(new Scene(nxtWindow, 600, 400));
                langStage.show();
                udvPane.setVisible(false);
            }
        }catch(Exception e) {
            popBox("Helytelen felhaználónév,\n jelszó kombináció", "Hiba");
        }
=======
        signIn.setVisible(false);
        langPane.setVisible(true);
    }

    public void handleFlagImageClicked() throws Exception{
        Parent learn = FXMLLoader.load(getClass().getResource("/fxml/Tanulas.fxml"));
        learnStage = new Stage();
        learnStage.setTitle("Nyelvválasztás");
        learnStage.setScene(new Scene(learn, 600, 400));
        learnStage.show();
>>>>>>> 9a6c5fc7751b159884991506616a52fa8803c4f6
    }

    public void changeButtonColor(){
        if (signIn.isHover()){
            signIn.setStyle("-fx-background-color: #b9865d");
        }else if (quitButt.isHover()){
            quitButt.setStyle("-fx-background-color: #b9865d");
        }else if(newPassButt.isHover()){
            newPassButt.setStyle("-fx-background-color: #b9865d");
        }else {
            regButt.setStyle("-fx-background-color: #b9865d");
        }
    }

    public void changeBackColor(){
        signIn.setStyle("-fx-background-color: #696969");
        quitButt.setStyle("-fx-background-color: #696969");
        newPassButt.setStyle("-fx-background-color: #696969");
        regButt.setStyle("-fx-background-color: #696969");
    }

    public void quitButtClicked() throws Exception {
        System.exit(0);
    }

    public void regButtClicked() throws Exception {
        Parent regIster = FXMLLoader.load(getClass().getResource("/fxml/Regisztracio.fxml"));
        regStage = new Stage();
        regStage.setTitle("Regisztráció");
        regStage.setScene(new Scene(regIster, 600, 200));
        regStage.show();
        udvPane.setOpacity(0.1);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        users = jsonReader.readFromJson(users);

        if(users == null) {
            ObjectMapper object = new ObjectMapper();
            try {
                users = object.readValue(adminUser.setupAdmin(), Map.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }


        System.out.println(users);
    }

    public static void popBox(String message,String title){
        Stage stage = new Stage();
        stage.setTitle(title);

        Label label = new Label(message);
        label.setId("label");

        Button okButton = new Button("OK");
        okButton.setOnAction(e -> stage.close());
        okButton.setId("button");

        VBox layout = new VBox(label,okButton);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(10);
        layout.setPadding(new Insets(10,10,10,10));

        Scene scene = new Scene(layout,200,150);

        stage.setResizable(false);
        stage.setScene(scene);
        stage.showAndWait();

       // log.info("Successfully popped a box with message: " + message);
    }
}
