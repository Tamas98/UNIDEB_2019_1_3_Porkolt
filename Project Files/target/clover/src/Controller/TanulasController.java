/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controller;

import Controll.Languages.English;
import Controll.Learning.LearningMethod;
import Controll.fileHandler.JsonReader;
import Controll.fileHandler.ReadFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.reflect.TypeToken;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class TanulasController extends LearningMethod implements Initializable {public static class __CLR4_3_11fx1fxk15j3g25{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569794468564L,8589935092L,1932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

        public static Map<String,String> language = new HashMap<String,String>();

        private Type token = new TypeToken<Map<String, String>>(){}.getType();

        private ReadFile jsonReader = new JsonReader("/Assets/english.json",token);

        private int counter;

        Stage testStage;

        @FXML
        public Button prevButt,testButt,nextButt,quitButt;

        @FXML
        public Text key,value;

    public void handleTestButtonClicked() throws Exception{try{__CLR4_3_11fx1fxk15j3g25.R.inc(1869);
        __CLR4_3_11fx1fxk15j3g25.R.inc(1870);Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Kikerdez.fxml"));
        __CLR4_3_11fx1fxk15j3g25.R.inc(1871);testStage = new Stage();
        __CLR4_3_11fx1fxk15j3g25.R.inc(1872);testStage.setTitle("Tanul\u00e1s");
        __CLR4_3_11fx1fxk15j3g25.R.inc(1873);testStage.setScene(new Scene(parent, 600, 400));
        __CLR4_3_11fx1fxk15j3g25.R.inc(1874);testStage.show();
    }finally{__CLR4_3_11fx1fxk15j3g25.R.flushNeeded();}}

    public void changeButtonColor(){try{__CLR4_3_11fx1fxk15j3g25.R.inc(1875);
        __CLR4_3_11fx1fxk15j3g25.R.inc(1876);if ((((prevButt.isHover())&&(__CLR4_3_11fx1fxk15j3g25.R.iget(1877)!=0|true))||(__CLR4_3_11fx1fxk15j3g25.R.iget(1878)==0&false))){{
            __CLR4_3_11fx1fxk15j3g25.R.inc(1879);prevButt.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_11fx1fxk15j3g25.R.inc(1880);if ((((testButt.isHover())&&(__CLR4_3_11fx1fxk15j3g25.R.iget(1881)!=0|true))||(__CLR4_3_11fx1fxk15j3g25.R.iget(1882)==0&false))){{
            __CLR4_3_11fx1fxk15j3g25.R.inc(1883);testButt.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_11fx1fxk15j3g25.R.inc(1884);if ((((nextButt.isHover())&&(__CLR4_3_11fx1fxk15j3g25.R.iget(1885)!=0|true))||(__CLR4_3_11fx1fxk15j3g25.R.iget(1886)==0&false))) {{
            __CLR4_3_11fx1fxk15j3g25.R.inc(1887);nextButt.setStyle("-fx-background-color: #b9865d");
        }}else{{
            __CLR4_3_11fx1fxk15j3g25.R.inc(1888);quitButt.setStyle("-fx-background-color: #b9865d");
        }
    }}}}finally{__CLR4_3_11fx1fxk15j3g25.R.flushNeeded();}}

    public void changeBackColor(){try{__CLR4_3_11fx1fxk15j3g25.R.inc(1889);
        __CLR4_3_11fx1fxk15j3g25.R.inc(1890);prevButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_11fx1fxk15j3g25.R.inc(1891);testButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_11fx1fxk15j3g25.R.inc(1892);nextButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_11fx1fxk15j3g25.R.inc(1893);quitButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_11fx1fxk15j3g25.R.flushNeeded();}}

    public void quitButtClicked() throws Exception {try{__CLR4_3_11fx1fxk15j3g25.R.inc(1894);
        __CLR4_3_11fx1fxk15j3g25.R.inc(1895);System.exit(0);
    }finally{__CLR4_3_11fx1fxk15j3g25.R.flushNeeded();}}

    @FXML
    public void prevWord(){try{__CLR4_3_11fx1fxk15j3g25.R.inc(1896);
        __CLR4_3_11fx1fxk15j3g25.R.inc(1897);if((((counter > 0)&&(__CLR4_3_11fx1fxk15j3g25.R.iget(1898)!=0|true))||(__CLR4_3_11fx1fxk15j3g25.R.iget(1899)==0&false))) {{
            __CLR4_3_11fx1fxk15j3g25.R.inc(1900);setPreWord(key.getText(),key,value);
            __CLR4_3_11fx1fxk15j3g25.R.inc(1901);counter -= 1;
            __CLR4_3_11fx1fxk15j3g25.R.inc(1902);nextButt.setDisable(false);
        }}else {__CLR4_3_11fx1fxk15j3g25.R.inc(1903);if((((counter == 0)&&(__CLR4_3_11fx1fxk15j3g25.R.iget(1904)!=0|true))||(__CLR4_3_11fx1fxk15j3g25.R.iget(1905)==0&false)))
            {__CLR4_3_11fx1fxk15j3g25.R.inc(1906);prevButt.setDisable(true);
    }}}finally{__CLR4_3_11fx1fxk15j3g25.R.flushNeeded();}}

    @FXML
    public void nextWord(){try{__CLR4_3_11fx1fxk15j3g25.R.inc(1907);
        __CLR4_3_11fx1fxk15j3g25.R.inc(1908);if((((counter < fixKeys.size()-1)&&(__CLR4_3_11fx1fxk15j3g25.R.iget(1909)!=0|true))||(__CLR4_3_11fx1fxk15j3g25.R.iget(1910)==0&false))) {{
            __CLR4_3_11fx1fxk15j3g25.R.inc(1911);setNextWord(key.getText(),key,value);
            __CLR4_3_11fx1fxk15j3g25.R.inc(1912);counter += 1;
            __CLR4_3_11fx1fxk15j3g25.R.inc(1913);prevButt.setDisable(false);
        }}else {__CLR4_3_11fx1fxk15j3g25.R.inc(1914);if((((counter == fixKeys.size()-1)&&(__CLR4_3_11fx1fxk15j3g25.R.iget(1915)!=0|true))||(__CLR4_3_11fx1fxk15j3g25.R.iget(1916)==0&false)))
            {__CLR4_3_11fx1fxk15j3g25.R.inc(1917);nextButt.setDisable(true);
    }}}finally{__CLR4_3_11fx1fxk15j3g25.R.flushNeeded();}}

    @Override
    public void initialize(URL location, ResourceBundle resources) {try{__CLR4_3_11fx1fxk15j3g25.R.inc(1918);
        __CLR4_3_11fx1fxk15j3g25.R.inc(1919);language = jsonReader.readFromJson(language);

        __CLR4_3_11fx1fxk15j3g25.R.inc(1920);if((((language == null)&&(__CLR4_3_11fx1fxk15j3g25.R.iget(1921)!=0|true))||(__CLR4_3_11fx1fxk15j3g25.R.iget(1922)==0&false))){{
            __CLR4_3_11fx1fxk15j3g25.R.inc(1923);ObjectMapper object = new ObjectMapper();
            __CLR4_3_11fx1fxk15j3g25.R.inc(1924);try {
                __CLR4_3_11fx1fxk15j3g25.R.inc(1925);language = object.readValue(English.getEnglishWords(),Map.class);
            } catch (JsonProcessingException e) {
                __CLR4_3_11fx1fxk15j3g25.R.inc(1926);e.printStackTrace();
            }
        }

        }__CLR4_3_11fx1fxk15j3g25.R.inc(1927);get10Random(language);

        __CLR4_3_11fx1fxk15j3g25.R.inc(1928);key.setText(fixKeys.get(0));
        __CLR4_3_11fx1fxk15j3g25.R.inc(1929);value.setText(FinalMap.get(fixKeys.get(0)));

        __CLR4_3_11fx1fxk15j3g25.R.inc(1930);prevButt.setDisable(true);
        __CLR4_3_11fx1fxk15j3g25.R.inc(1931);counter=0;


    }finally{__CLR4_3_11fx1fxk15j3g25.R.flushNeeded();}}

}

