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

public class UdvozloController extends LoginPhase implements Initializable {public static class __CLR4_3_11ek1ekk16a5ejc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u0065\u0072\u0064\u0065\u0069\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0301\u0073\u0069\u0020\u006d\u006f\u0301\u0064\u0073\u007a\u0065\u0072\u0074\u0061\u006e\u006f\u006b\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569839909379L,8589935092L,1899,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public void handleNewPassButtonClicked() throws Exception{try{__CLR4_3_11ek1ekk16a5ejc.R.inc(1820);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1821);Parent newPassword = FXMLLoader.load(getClass().getResource("/fxml/Uj_jelszo.fxml"));

        __CLR4_3_11ek1ekk16a5ejc.R.inc(1822);newPassStage = new Stage();
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1823);newPassStage.setTitle("Kezd\u0151k\u00e9perny\u0151");
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1824);newPassStage.setScene(new Scene(newPassword, 600, 200));
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1825);newPassStage.show();
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1826);udvPane.setOpacity(0.1);

    }finally{__CLR4_3_11ek1ekk16a5ejc.R.flushNeeded();}}

    public void handleLogInButtonClicked() throws Exception{try{__CLR4_3_11ek1ekk16a5ejc.R.inc(1827);

        __CLR4_3_11ek1ekk16a5ejc.R.inc(1828);String user = "";

        __CLR4_3_11ek1ekk16a5ejc.R.inc(1829);try{
            __CLR4_3_11ek1ekk16a5ejc.R.inc(1830);user = users.keySet().stream().filter(u -> (((u.equals("admin"))&&(__CLR4_3_11ek1ekk16a5ejc.R.iget(1831)!=0|true))||(__CLR4_3_11ek1ekk16a5ejc.R.iget(1832)==0&false))? u.equals(passWord.getText()):u.equals(hasher(passWord.getText()))).collect(Collectors.toList()).get(0);
            __CLR4_3_11ek1ekk16a5ejc.R.inc(1833);if((((users.get(user).getUsername().equals(userName.getText()))&&(__CLR4_3_11ek1ekk16a5ejc.R.iget(1834)!=0|true))||(__CLR4_3_11ek1ekk16a5ejc.R.iget(1835)==0&false))){{
                __CLR4_3_11ek1ekk16a5ejc.R.inc(1836);signIn.setVisible(false);
                __CLR4_3_11ek1ekk16a5ejc.R.inc(1837);langPane.setVisible(true);
            }
        }}catch(Exception e) {
            __CLR4_3_11ek1ekk16a5ejc.R.inc(1838);popBox("Helytelen felhazn\u00e1l\u00f3n\u00e9v,\n jelsz\u00f3 kombin\u00e1ci\u00f3", "Hiba");
        }
    }finally{__CLR4_3_11ek1ekk16a5ejc.R.flushNeeded();}}

    public void handleFlagImageClicked() throws Exception{try{__CLR4_3_11ek1ekk16a5ejc.R.inc(1839);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1840);Parent learn = FXMLLoader.load(getClass().getResource("/fxml/Tanulas.fxml"));
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1841);learnStage = new Stage();
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1842);learnStage.setTitle("Nyelvv\u00e1laszt\u00e1s");
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1843);learnStage.setScene(new Scene(learn, 600, 400));
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1844);learnStage.show();

    }finally{__CLR4_3_11ek1ekk16a5ejc.R.flushNeeded();}}

    public void changeButtonColor(){try{__CLR4_3_11ek1ekk16a5ejc.R.inc(1845);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1846);if ((((signIn.isHover())&&(__CLR4_3_11ek1ekk16a5ejc.R.iget(1847)!=0|true))||(__CLR4_3_11ek1ekk16a5ejc.R.iget(1848)==0&false))){{
            __CLR4_3_11ek1ekk16a5ejc.R.inc(1849);signIn.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_11ek1ekk16a5ejc.R.inc(1850);if ((((quitButt.isHover())&&(__CLR4_3_11ek1ekk16a5ejc.R.iget(1851)!=0|true))||(__CLR4_3_11ek1ekk16a5ejc.R.iget(1852)==0&false))){{
            __CLR4_3_11ek1ekk16a5ejc.R.inc(1853);quitButt.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_11ek1ekk16a5ejc.R.inc(1854);if((((newPassButt.isHover())&&(__CLR4_3_11ek1ekk16a5ejc.R.iget(1855)!=0|true))||(__CLR4_3_11ek1ekk16a5ejc.R.iget(1856)==0&false))){{
            __CLR4_3_11ek1ekk16a5ejc.R.inc(1857);newPassButt.setStyle("-fx-background-color: #b9865d");
        }}else {{
            __CLR4_3_11ek1ekk16a5ejc.R.inc(1858);regButt.setStyle("-fx-background-color: #b9865d");
        }
    }}}}finally{__CLR4_3_11ek1ekk16a5ejc.R.flushNeeded();}}

    public void changeBackColor(){try{__CLR4_3_11ek1ekk16a5ejc.R.inc(1859);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1860);signIn.setStyle("-fx-background-color: #696969");
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1861);quitButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1862);newPassButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1863);regButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_11ek1ekk16a5ejc.R.flushNeeded();}}

    public void quitButtClicked() throws Exception {try{__CLR4_3_11ek1ekk16a5ejc.R.inc(1864);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1865);System.exit(0);
    }finally{__CLR4_3_11ek1ekk16a5ejc.R.flushNeeded();}}

    public void regButtClicked() throws Exception {try{__CLR4_3_11ek1ekk16a5ejc.R.inc(1866);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1867);Parent regIster = FXMLLoader.load(getClass().getResource("/fxml/Regisztracio.fxml"));
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1868);regStage = new Stage();
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1869);regStage.setTitle("Regisztr\u00e1ci\u00f3");
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1870);regStage.setScene(new Scene(regIster, 600, 200));
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1871);regStage.show();
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1872);udvPane.setOpacity(0.1);
    }finally{__CLR4_3_11ek1ekk16a5ejc.R.flushNeeded();}}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {try{__CLR4_3_11ek1ekk16a5ejc.R.inc(1873);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1874);users = jsonReader.readFromJson(users);

        __CLR4_3_11ek1ekk16a5ejc.R.inc(1875);if((((users == null)&&(__CLR4_3_11ek1ekk16a5ejc.R.iget(1876)!=0|true))||(__CLR4_3_11ek1ekk16a5ejc.R.iget(1877)==0&false))) {{
            __CLR4_3_11ek1ekk16a5ejc.R.inc(1878);ObjectMapper object = new ObjectMapper();
            __CLR4_3_11ek1ekk16a5ejc.R.inc(1879);try {
                __CLR4_3_11ek1ekk16a5ejc.R.inc(1880);users = object.readValue(adminUser.setupAdmin(), Map.class);
            } catch (JsonProcessingException e) {
                __CLR4_3_11ek1ekk16a5ejc.R.inc(1881);e.printStackTrace();
            }
        }


        }__CLR4_3_11ek1ekk16a5ejc.R.inc(1882);System.out.println(users);
    }finally{__CLR4_3_11ek1ekk16a5ejc.R.flushNeeded();}}

    public static void popBox(String message,String title){try{__CLR4_3_11ek1ekk16a5ejc.R.inc(1883);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1884);Stage stage = new Stage();
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1885);stage.setTitle(title);

        __CLR4_3_11ek1ekk16a5ejc.R.inc(1886);Label label = new Label(message);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1887);label.setId("label");

        __CLR4_3_11ek1ekk16a5ejc.R.inc(1888);Button okButton = new Button("OK");
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1889);okButton.setOnAction(e -> stage.close());
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1890);okButton.setId("button");

        __CLR4_3_11ek1ekk16a5ejc.R.inc(1891);VBox layout = new VBox(label,okButton);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1892);layout.setAlignment(Pos.CENTER);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1893);layout.setSpacing(10);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1894);layout.setPadding(new Insets(10,10,10,10));

        __CLR4_3_11ek1ekk16a5ejc.R.inc(1895);Scene scene = new Scene(layout,200,150);

        __CLR4_3_11ek1ekk16a5ejc.R.inc(1896);stage.setResizable(false);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1897);stage.setScene(scene);
        __CLR4_3_11ek1ekk16a5ejc.R.inc(1898);stage.showAndWait();

       // log.info("Successfully popped a box with message: " + message);
    }finally{__CLR4_3_11ek1ekk16a5ejc.R.flushNeeded();}}
}
