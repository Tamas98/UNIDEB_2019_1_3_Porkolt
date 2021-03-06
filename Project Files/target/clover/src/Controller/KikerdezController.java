/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controller;

import Controll.Kikerdez.TestPhase;
import Controll.Learning.LearningMethod;
import Controll.fileHandler.JsonReader;
import Controll.fileHandler.ReadFile;
import Modell.User;
import com.google.gson.reflect.TypeToken;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class KikerdezController extends TestPhase implements Initializable {public static class __CLR4_3_14u4uk1gc1avs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1570447739092L,8589935092L,211,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Random random = new Random();

    @FXML
    public Button nextButt,quitButt;

    @FXML
    public Text helyes;

    @FXML
    public TextField askedOne,anotherOne;

    public void changeButtonColor() {try{__CLR4_3_14u4uk1gc1avs.R.inc(174);
        __CLR4_3_14u4uk1gc1avs.R.inc(175);if ((((nextButt.isHover())&&(__CLR4_3_14u4uk1gc1avs.R.iget(176)!=0|true))||(__CLR4_3_14u4uk1gc1avs.R.iget(177)==0&false))) {{
            __CLR4_3_14u4uk1gc1avs.R.inc(178);nextButt.setStyle("-fx-background-color: #b9865d");
        } }else {{
            __CLR4_3_14u4uk1gc1avs.R.inc(179);quitButt.setStyle("-fx-background-color: #b9865d");
        }
    }}finally{__CLR4_3_14u4uk1gc1avs.R.flushNeeded();}}

    public void changeBackColor() {try{__CLR4_3_14u4uk1gc1avs.R.inc(180);
        __CLR4_3_14u4uk1gc1avs.R.inc(181);nextButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_14u4uk1gc1avs.R.inc(182);quitButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_14u4uk1gc1avs.R.flushNeeded();}}

    public void quitButtClicked() throws Exception {try{__CLR4_3_14u4uk1gc1avs.R.inc(183);
        __CLR4_3_14u4uk1gc1avs.R.inc(184);System.exit(0);
    }finally{__CLR4_3_14u4uk1gc1avs.R.flushNeeded();}}

    @FXML
    public void checkAnsw() throws IOException {try{__CLR4_3_14u4uk1gc1avs.R.inc(185);
        __CLR4_3_14u4uk1gc1avs.R.inc(186);checkAnswer(anotherOne.getText(),askedOne.getText(),helyes);

        __CLR4_3_14u4uk1gc1avs.R.inc(187);anotherOne.setDisable(false);
        __CLR4_3_14u4uk1gc1avs.R.inc(188);askedOne.setDisable(false);

        __CLR4_3_14u4uk1gc1avs.R.inc(189);String nextKey =/* (random.nextInt(10) < 8) ? */LearningMethod.fixKeys.get(random.nextInt(10));

        __CLR4_3_14u4uk1gc1avs.R.inc(190);if((((random.nextInt(10) < 5)&&(__CLR4_3_14u4uk1gc1avs.R.iget(191)!=0|true))||(__CLR4_3_14u4uk1gc1avs.R.iget(192)==0&false))){{
            __CLR4_3_14u4uk1gc1avs.R.inc(193);anotherOne.setDisable(true);
            __CLR4_3_14u4uk1gc1avs.R.inc(194);anotherOne.setText(nextKey);
            __CLR4_3_14u4uk1gc1avs.R.inc(195);askedOne.setText("");
        }}else{{
            __CLR4_3_14u4uk1gc1avs.R.inc(196);askedOne.setDisable(true);
            __CLR4_3_14u4uk1gc1avs.R.inc(197);askedOne.setText(LearningMethod.FinalMap.get(nextKey));
            __CLR4_3_14u4uk1gc1avs.R.inc(198);anotherOne.setText("");
        }

        }__CLR4_3_14u4uk1gc1avs.R.inc(199);if((((TestPhase.learned.size() == 10)&&(__CLR4_3_14u4uk1gc1avs.R.iget(200)!=0|true))||(__CLR4_3_14u4uk1gc1avs.R.iget(201)==0&false))){{
                __CLR4_3_14u4uk1gc1avs.R.inc(202);Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Eredmeny.fxml"));
                __CLR4_3_14u4uk1gc1avs.R.inc(203);Stage eredmenyStage = new Stage();
                __CLR4_3_14u4uk1gc1avs.R.inc(204);eredmenyStage.setTitle("Kezd\u0151k\u00e9perny\u0151");
                __CLR4_3_14u4uk1gc1avs.R.inc(205);eredmenyStage.setScene(new Scene(parent, 600, 400));
                __CLR4_3_14u4uk1gc1avs.R.inc(206);eredmenyStage.show();
        }
    }}finally{__CLR4_3_14u4uk1gc1avs.R.flushNeeded();}}




    @Override
    public void initialize(URL location, ResourceBundle resources) {try{__CLR4_3_14u4uk1gc1avs.R.inc(207);



       __CLR4_3_14u4uk1gc1avs.R.inc(208);String starter = LearningMethod.FinalMap.keySet().stream().collect(Collectors.toList()).get(random.nextInt(10));

       __CLR4_3_14u4uk1gc1avs.R.inc(209);anotherOne.setText(starter);
       __CLR4_3_14u4uk1gc1avs.R.inc(210);anotherOne.setDisable(true);

    }finally{__CLR4_3_14u4uk1gc1avs.R.flushNeeded();}}



}
