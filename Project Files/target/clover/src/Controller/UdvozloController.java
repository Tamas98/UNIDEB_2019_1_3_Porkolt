/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controller;

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
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class UdvozloController extends LoginPhase implements Initializable {public static class __CLR4_3_18i8ik1gc1awy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1570447739092L,8589935092L,385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    /**
     * \u00daj jelsz\u00f3 gomb
     * @throws Exception
     */
    public void handleNewPassButtonClicked() throws Exception{try{__CLR4_3_18i8ik1gc1awy.R.inc(306);
        __CLR4_3_18i8ik1gc1awy.R.inc(307);Parent newPassword = FXMLLoader.load(getClass().getResource("/fxml/Uj_jelszo.fxml"));

        __CLR4_3_18i8ik1gc1awy.R.inc(308);newPassStage = new Stage();
        __CLR4_3_18i8ik1gc1awy.R.inc(309);newPassStage.setTitle("Kezd\u0151k\u00e9perny\u0151");
        __CLR4_3_18i8ik1gc1awy.R.inc(310);newPassStage.setScene(new Scene(newPassword, 600, 200));
        __CLR4_3_18i8ik1gc1awy.R.inc(311);newPassStage.show();
        __CLR4_3_18i8ik1gc1awy.R.inc(312);udvPane.setOpacity(0.1);

    }finally{__CLR4_3_18i8ik1gc1awy.R.flushNeeded();}}

    /**
     * Bejelentkez\u00e9s gomb
     * @throws Exception
     */
    public void handleLogInButtonClicked() throws Exception{try{__CLR4_3_18i8ik1gc1awy.R.inc(313);

        __CLR4_3_18i8ik1gc1awy.R.inc(314);String user = "";

        __CLR4_3_18i8ik1gc1awy.R.inc(315);try{
            __CLR4_3_18i8ik1gc1awy.R.inc(316);user = users.keySet().stream().filter(u -> (((u.equals("admin"))&&(__CLR4_3_18i8ik1gc1awy.R.iget(317)!=0|true))||(__CLR4_3_18i8ik1gc1awy.R.iget(318)==0&false))? u.equals(passWord.getText()):u.equals(hasher(passWord.getText()))).collect(Collectors.toList()).get(0);
            __CLR4_3_18i8ik1gc1awy.R.inc(319);if((((users.get(user).getUsername().equals(userName.getText()))&&(__CLR4_3_18i8ik1gc1awy.R.iget(320)!=0|true))||(__CLR4_3_18i8ik1gc1awy.R.iget(321)==0&false))){{
                __CLR4_3_18i8ik1gc1awy.R.inc(322);signIn.setVisible(false);
                __CLR4_3_18i8ik1gc1awy.R.inc(323);langPane.setVisible(true);
            }
        }}catch(Exception e) {
            __CLR4_3_18i8ik1gc1awy.R.inc(324);popBox("Helytelen felhazn\u00e1l\u00f3n\u00e9v,\n jelsz\u00f3 kombin\u00e1ci\u00f3", "Hiba");
        }
    }finally{__CLR4_3_18i8ik1gc1awy.R.flushNeeded();}}

    /**
     * Nyelv\u00e1laszt\u00e1sn\u00e1l a z\u00e1szl\u00f3ra kattint\u00e1s
     * @throws Exception
     */
    public void handleFlagImageClicked() throws Exception{try{__CLR4_3_18i8ik1gc1awy.R.inc(325);
        __CLR4_3_18i8ik1gc1awy.R.inc(326);Parent learn = FXMLLoader.load(getClass().getResource("/fxml/Tanulas.fxml"));
        __CLR4_3_18i8ik1gc1awy.R.inc(327);learnStage = new Stage();
        __CLR4_3_18i8ik1gc1awy.R.inc(328);learnStage.setTitle("Nyelvv\u00e1laszt\u00e1s");
        __CLR4_3_18i8ik1gc1awy.R.inc(329);learnStage.setScene(new Scene(learn, 600, 400));
        __CLR4_3_18i8ik1gc1awy.R.inc(330);learnStage.show();

    }finally{__CLR4_3_18i8ik1gc1awy.R.flushNeeded();}}

    /**
     * Gombok sz\u00edneinek megv\u00e1ltoztaz\u00e1sa
     */
    public void changeButtonColor(){try{__CLR4_3_18i8ik1gc1awy.R.inc(331);
        __CLR4_3_18i8ik1gc1awy.R.inc(332);if ((((signIn.isHover())&&(__CLR4_3_18i8ik1gc1awy.R.iget(333)!=0|true))||(__CLR4_3_18i8ik1gc1awy.R.iget(334)==0&false))){{
            __CLR4_3_18i8ik1gc1awy.R.inc(335);signIn.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_18i8ik1gc1awy.R.inc(336);if ((((quitButt.isHover())&&(__CLR4_3_18i8ik1gc1awy.R.iget(337)!=0|true))||(__CLR4_3_18i8ik1gc1awy.R.iget(338)==0&false))){{
            __CLR4_3_18i8ik1gc1awy.R.inc(339);quitButt.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_18i8ik1gc1awy.R.inc(340);if((((newPassButt.isHover())&&(__CLR4_3_18i8ik1gc1awy.R.iget(341)!=0|true))||(__CLR4_3_18i8ik1gc1awy.R.iget(342)==0&false))){{
            __CLR4_3_18i8ik1gc1awy.R.inc(343);newPassButt.setStyle("-fx-background-color: #b9865d");
        }}else {{
            __CLR4_3_18i8ik1gc1awy.R.inc(344);regButt.setStyle("-fx-background-color: #b9865d");
        }
    }}}}finally{__CLR4_3_18i8ik1gc1awy.R.flushNeeded();}}

    public void changeBackColor(){try{__CLR4_3_18i8ik1gc1awy.R.inc(345);
        __CLR4_3_18i8ik1gc1awy.R.inc(346);signIn.setStyle("-fx-background-color: #696969");
        __CLR4_3_18i8ik1gc1awy.R.inc(347);quitButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_18i8ik1gc1awy.R.inc(348);newPassButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_18i8ik1gc1awy.R.inc(349);regButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_18i8ik1gc1awy.R.flushNeeded();}}

    /**
     * Kil\u00e9p\u00e9s gomb
     * @throws Exception
     */
    public void quitButtClicked() throws Exception {try{__CLR4_3_18i8ik1gc1awy.R.inc(350);
        __CLR4_3_18i8ik1gc1awy.R.inc(351);System.exit(0);
    }finally{__CLR4_3_18i8ik1gc1awy.R.flushNeeded();}}

    /**
     * Regisztr\u00e1ci\u00f3 gomb
     * @throws Exception
     */
    public void regButtClicked() throws Exception {try{__CLR4_3_18i8ik1gc1awy.R.inc(352);
        __CLR4_3_18i8ik1gc1awy.R.inc(353);Parent regIster = FXMLLoader.load(getClass().getResource("/fxml/Regisztracio.fxml"));
        __CLR4_3_18i8ik1gc1awy.R.inc(354);regStage = new Stage();
        __CLR4_3_18i8ik1gc1awy.R.inc(355);regStage.setTitle("Regisztr\u00e1ci\u00f3");
        __CLR4_3_18i8ik1gc1awy.R.inc(356);regStage.setScene(new Scene(regIster, 600, 200));
        __CLR4_3_18i8ik1gc1awy.R.inc(357);regStage.show();
        __CLR4_3_18i8ik1gc1awy.R.inc(358);udvPane.setOpacity(0.1);
    }finally{__CLR4_3_18i8ik1gc1awy.R.flushNeeded();}}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {try{__CLR4_3_18i8ik1gc1awy.R.inc(359);
        __CLR4_3_18i8ik1gc1awy.R.inc(360);users = jsonReader.readFromJson(users);

        __CLR4_3_18i8ik1gc1awy.R.inc(361);if((((users == null)&&(__CLR4_3_18i8ik1gc1awy.R.iget(362)!=0|true))||(__CLR4_3_18i8ik1gc1awy.R.iget(363)==0&false))) {{
            __CLR4_3_18i8ik1gc1awy.R.inc(364);ObjectMapper object = new ObjectMapper();
            __CLR4_3_18i8ik1gc1awy.R.inc(365);try {
                __CLR4_3_18i8ik1gc1awy.R.inc(366);users = object.readValue(adminUser.setupAdmin(), Map.class);
            } catch (JsonProcessingException e) {
                __CLR4_3_18i8ik1gc1awy.R.inc(367);e.printStackTrace();
            }
        }


        }__CLR4_3_18i8ik1gc1awy.R.inc(368);System.out.println(users);
    }finally{__CLR4_3_18i8ik1gc1awy.R.flushNeeded();}}

    public static void popBox(String message,String title){try{__CLR4_3_18i8ik1gc1awy.R.inc(369);
        __CLR4_3_18i8ik1gc1awy.R.inc(370);Stage stage = new Stage();
        __CLR4_3_18i8ik1gc1awy.R.inc(371);stage.setTitle(title);

        __CLR4_3_18i8ik1gc1awy.R.inc(372);Label label = new Label(message);
        __CLR4_3_18i8ik1gc1awy.R.inc(373);label.setId("label");

        __CLR4_3_18i8ik1gc1awy.R.inc(374);Button okButton = new Button("OK");
        __CLR4_3_18i8ik1gc1awy.R.inc(375);okButton.setOnAction(e -> stage.close());
        __CLR4_3_18i8ik1gc1awy.R.inc(376);okButton.setId("button");

        __CLR4_3_18i8ik1gc1awy.R.inc(377);VBox layout = new VBox(label,okButton);
        __CLR4_3_18i8ik1gc1awy.R.inc(378);layout.setAlignment(Pos.CENTER);
        __CLR4_3_18i8ik1gc1awy.R.inc(379);layout.setSpacing(10);
        __CLR4_3_18i8ik1gc1awy.R.inc(380);layout.setPadding(new Insets(10,10,10,10));

        __CLR4_3_18i8ik1gc1awy.R.inc(381);Scene scene = new Scene(layout,200,150);

        __CLR4_3_18i8ik1gc1awy.R.inc(382);stage.setResizable(false);
        __CLR4_3_18i8ik1gc1awy.R.inc(383);stage.setScene(scene);
        __CLR4_3_18i8ik1gc1awy.R.inc(384);stage.showAndWait();

       // log.info("Successfully popped a box with message: " + message);
    }finally{__CLR4_3_18i8ik1gc1awy.R.flushNeeded();}}
}
