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
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class UdvozloController extends LoginPhase implements Initializable {public static class __CLR4_3_119v19vk1683203{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569836440753L,8589935092L,1728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //private Type token = new TypeToken<Map<String,Map<String,String>>>(){}.getType();
    private Type token = new TypeToken<Map<String,User>>(){}.getType();
    private ReadFile jsonReader = new JsonReader("/Assets/users.json",token);

    //private Map<String,Map<String,String>> users = new HashMap<>();
    public static Map<String,User> users = new HashMap<>();

    Stage newPassStage, chooseStage, regStage;
    public Button newPassButt, signIn, quitButt, regButt;
    public AnchorPane udvPane;

    @FXML
    public TextField userName;

    @FXML
    public PasswordField passWord;

    public void handleNewPassButtonClicked() throws Exception{try{__CLR4_3_119v19vk1683203.R.inc(1651);
        __CLR4_3_119v19vk1683203.R.inc(1652);Parent newPassword = FXMLLoader.load(getClass().getResource("/fxml/Uj_jelszo.fxml"));
        __CLR4_3_119v19vk1683203.R.inc(1653);chooseStage = new Stage();
        __CLR4_3_119v19vk1683203.R.inc(1654);chooseStage.setTitle("Kezd\u0151k\u00e9perny\u0151");
        __CLR4_3_119v19vk1683203.R.inc(1655);chooseStage.setScene(new Scene(newPassword, 600, 200));
        __CLR4_3_119v19vk1683203.R.inc(1656);chooseStage.show();
    }finally{__CLR4_3_119v19vk1683203.R.flushNeeded();}}


    public void handleLogInButtonClicked() throws Exception{try{__CLR4_3_119v19vk1683203.R.inc(1657);

        __CLR4_3_119v19vk1683203.R.inc(1658);String user = "";

        __CLR4_3_119v19vk1683203.R.inc(1659);try{
            __CLR4_3_119v19vk1683203.R.inc(1660);user = users.keySet().stream().filter(u -> (((u.equals("admin"))&&(__CLR4_3_119v19vk1683203.R.iget(1661)!=0|true))||(__CLR4_3_119v19vk1683203.R.iget(1662)==0&false))? u.equals(passWord.getText()):u.equals(hasher(passWord.getText()))).collect(Collectors.toList()).get(0);
            __CLR4_3_119v19vk1683203.R.inc(1663);System.out.println(users.get(user));
            __CLR4_3_119v19vk1683203.R.inc(1664);System.out.println(users.get(user).getUsername());

            __CLR4_3_119v19vk1683203.R.inc(1665);if((((users.get(user).getUsername().equals(userName.getText()))&&(__CLR4_3_119v19vk1683203.R.iget(1666)!=0|true))||(__CLR4_3_119v19vk1683203.R.iget(1667)==0&false))){{
                __CLR4_3_119v19vk1683203.R.inc(1668);Parent nxtWindow = FXMLLoader.load(getClass().getResource("/fxml/Nyelvvalasztas.fxml"));
                __CLR4_3_119v19vk1683203.R.inc(1669);Stage langStage = new Stage();
                __CLR4_3_119v19vk1683203.R.inc(1670);langStage.setTitle("V\u00e1laszthat\u00f3 nyelvek");
                __CLR4_3_119v19vk1683203.R.inc(1671);langStage.setScene(new Scene(nxtWindow, 600, 400));
                __CLR4_3_119v19vk1683203.R.inc(1672);langStage.show();
                __CLR4_3_119v19vk1683203.R.inc(1673);udvPane.setVisible(false);
            }
        }}catch(Exception e) {
            __CLR4_3_119v19vk1683203.R.inc(1674);popBox("Helytelen felhazn\u00e1l\u00f3n\u00e9v,\n jelsz\u00f3 kombin\u00e1ci\u00f3", "Hiba");
        }
    }finally{__CLR4_3_119v19vk1683203.R.flushNeeded();}}

    public void changeButtonColor(){try{__CLR4_3_119v19vk1683203.R.inc(1675);
        __CLR4_3_119v19vk1683203.R.inc(1676);if ((((signIn.isHover())&&(__CLR4_3_119v19vk1683203.R.iget(1677)!=0|true))||(__CLR4_3_119v19vk1683203.R.iget(1678)==0&false))){{
            __CLR4_3_119v19vk1683203.R.inc(1679);signIn.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_119v19vk1683203.R.inc(1680);if ((((quitButt.isHover())&&(__CLR4_3_119v19vk1683203.R.iget(1681)!=0|true))||(__CLR4_3_119v19vk1683203.R.iget(1682)==0&false))){{
            __CLR4_3_119v19vk1683203.R.inc(1683);quitButt.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_119v19vk1683203.R.inc(1684);if((((newPassButt.isHover())&&(__CLR4_3_119v19vk1683203.R.iget(1685)!=0|true))||(__CLR4_3_119v19vk1683203.R.iget(1686)==0&false))){{
            __CLR4_3_119v19vk1683203.R.inc(1687);newPassButt.setStyle("-fx-background-color: #b9865d");
        }}else {{
            __CLR4_3_119v19vk1683203.R.inc(1688);regButt.setStyle("-fx-background-color: #b9865d");
        }
    }}}}finally{__CLR4_3_119v19vk1683203.R.flushNeeded();}}

    public void changeBackColor(){try{__CLR4_3_119v19vk1683203.R.inc(1689);
        __CLR4_3_119v19vk1683203.R.inc(1690);signIn.setStyle("-fx-background-color: #696969");
        __CLR4_3_119v19vk1683203.R.inc(1691);quitButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_119v19vk1683203.R.inc(1692);newPassButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_119v19vk1683203.R.inc(1693);regButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_119v19vk1683203.R.flushNeeded();}}

    public void quitButtClicked() throws Exception {try{__CLR4_3_119v19vk1683203.R.inc(1694);
        __CLR4_3_119v19vk1683203.R.inc(1695);System.exit(0);
    }finally{__CLR4_3_119v19vk1683203.R.flushNeeded();}}

    public void regButtClicked() throws Exception {try{__CLR4_3_119v19vk1683203.R.inc(1696);
        __CLR4_3_119v19vk1683203.R.inc(1697);Parent regIster = FXMLLoader.load(getClass().getResource("/fxml/Regisztracio.fxml"));
        __CLR4_3_119v19vk1683203.R.inc(1698);regStage = new Stage();
        __CLR4_3_119v19vk1683203.R.inc(1699);regStage.setTitle("Regisztr\u00e1ci\u00f3");
        __CLR4_3_119v19vk1683203.R.inc(1700);regStage.setScene(new Scene(regIster, 600, 200));
        __CLR4_3_119v19vk1683203.R.inc(1701);regStage.show();
    }finally{__CLR4_3_119v19vk1683203.R.flushNeeded();}}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {try{__CLR4_3_119v19vk1683203.R.inc(1702);
        __CLR4_3_119v19vk1683203.R.inc(1703);users = jsonReader.readFromJson(users);

        __CLR4_3_119v19vk1683203.R.inc(1704);if((((users == null)&&(__CLR4_3_119v19vk1683203.R.iget(1705)!=0|true))||(__CLR4_3_119v19vk1683203.R.iget(1706)==0&false))) {{
            __CLR4_3_119v19vk1683203.R.inc(1707);ObjectMapper object = new ObjectMapper();
            __CLR4_3_119v19vk1683203.R.inc(1708);try {
                __CLR4_3_119v19vk1683203.R.inc(1709);users = object.readValue(adminUser.setupAdmin(), Map.class);
            } catch (JsonProcessingException e) {
                __CLR4_3_119v19vk1683203.R.inc(1710);e.printStackTrace();
            }
        }


        }__CLR4_3_119v19vk1683203.R.inc(1711);System.out.println(users);
    }finally{__CLR4_3_119v19vk1683203.R.flushNeeded();}}

    public static void popBox(String message,String title){try{__CLR4_3_119v19vk1683203.R.inc(1712);
        __CLR4_3_119v19vk1683203.R.inc(1713);Stage stage = new Stage();
        __CLR4_3_119v19vk1683203.R.inc(1714);stage.setTitle(title);

        __CLR4_3_119v19vk1683203.R.inc(1715);Label label = new Label(message);
        __CLR4_3_119v19vk1683203.R.inc(1716);label.setId("label");

        __CLR4_3_119v19vk1683203.R.inc(1717);Button okButton = new Button("OK");
        __CLR4_3_119v19vk1683203.R.inc(1718);okButton.setOnAction(e -> stage.close());
        __CLR4_3_119v19vk1683203.R.inc(1719);okButton.setId("button");

        __CLR4_3_119v19vk1683203.R.inc(1720);VBox layout = new VBox(label,okButton);
        __CLR4_3_119v19vk1683203.R.inc(1721);layout.setAlignment(Pos.CENTER);
        __CLR4_3_119v19vk1683203.R.inc(1722);layout.setSpacing(10);
        __CLR4_3_119v19vk1683203.R.inc(1723);layout.setPadding(new Insets(10,10,10,10));

        __CLR4_3_119v19vk1683203.R.inc(1724);Scene scene = new Scene(layout,200,150);

        __CLR4_3_119v19vk1683203.R.inc(1725);stage.setResizable(false);
        __CLR4_3_119v19vk1683203.R.inc(1726);stage.setScene(scene);
        __CLR4_3_119v19vk1683203.R.inc(1727);stage.showAndWait();

       // log.info("Successfully popped a box with message: " + message);
    }finally{__CLR4_3_119v19vk1683203.R.flushNeeded();}}
}
