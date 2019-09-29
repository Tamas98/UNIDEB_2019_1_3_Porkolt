/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controller;

import Controll.fileHandler.JsonReader;
import Controll.fileHandler.ReadFile;
import com.google.gson.reflect.TypeToken;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class TanulasController implements Initializable {public static class __CLR4_3_13m3mk15c8cdk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569782939530L,8589935092L,163,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

        public static Map<String,String> language = new HashMap<String,String>();

        private Type token = new TypeToken<Map<String, String>>(){}.getType();

        private ReadFile jsonReader = new JsonReader("/Assets/exercises.json",token);

        Stage testStage;
        public Button prevButt,testButt,nextButt,quitButt;

    public void handleTestButtonClicked() throws Exception{try{__CLR4_3_13m3mk15c8cdk.R.inc(130);
        __CLR4_3_13m3mk15c8cdk.R.inc(131);Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Kikerdez.fxml"));
        __CLR4_3_13m3mk15c8cdk.R.inc(132);testStage = new Stage();
        __CLR4_3_13m3mk15c8cdk.R.inc(133);testStage.setTitle("Tanul\u00e1s");
        __CLR4_3_13m3mk15c8cdk.R.inc(134);testStage.setScene(new Scene(parent, 600, 400));
        __CLR4_3_13m3mk15c8cdk.R.inc(135);testStage.show();
    }finally{__CLR4_3_13m3mk15c8cdk.R.flushNeeded();}}

    public void changeButtonColor(){try{__CLR4_3_13m3mk15c8cdk.R.inc(136);
        __CLR4_3_13m3mk15c8cdk.R.inc(137);if ((((prevButt.isHover())&&(__CLR4_3_13m3mk15c8cdk.R.iget(138)!=0|true))||(__CLR4_3_13m3mk15c8cdk.R.iget(139)==0&false))){{
            __CLR4_3_13m3mk15c8cdk.R.inc(140);prevButt.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_13m3mk15c8cdk.R.inc(141);if ((((testButt.isHover())&&(__CLR4_3_13m3mk15c8cdk.R.iget(142)!=0|true))||(__CLR4_3_13m3mk15c8cdk.R.iget(143)==0&false))){{
            __CLR4_3_13m3mk15c8cdk.R.inc(144);testButt.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_13m3mk15c8cdk.R.inc(145);if ((((nextButt.isHover())&&(__CLR4_3_13m3mk15c8cdk.R.iget(146)!=0|true))||(__CLR4_3_13m3mk15c8cdk.R.iget(147)==0&false))) {{
            __CLR4_3_13m3mk15c8cdk.R.inc(148);nextButt.setStyle("-fx-background-color: #b9865d");
        }}else{{
            __CLR4_3_13m3mk15c8cdk.R.inc(149);quitButt.setStyle("-fx-background-color: #b9865d");
        }
    }}}}finally{__CLR4_3_13m3mk15c8cdk.R.flushNeeded();}}

    public void changeBackColor(){try{__CLR4_3_13m3mk15c8cdk.R.inc(150);
        __CLR4_3_13m3mk15c8cdk.R.inc(151);prevButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_13m3mk15c8cdk.R.inc(152);testButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_13m3mk15c8cdk.R.inc(153);nextButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_13m3mk15c8cdk.R.inc(154);quitButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_13m3mk15c8cdk.R.flushNeeded();}}

    public void quitButtClicked() throws Exception {try{__CLR4_3_13m3mk15c8cdk.R.inc(155);
        __CLR4_3_13m3mk15c8cdk.R.inc(156);System.exit(0);
    }finally{__CLR4_3_13m3mk15c8cdk.R.flushNeeded();}}

    @Override
    public void initialize(URL location, ResourceBundle resources) {try{__CLR4_3_13m3mk15c8cdk.R.inc(157);
        __CLR4_3_13m3mk15c8cdk.R.inc(158);language = jsonReader.readFromJson(language);

        __CLR4_3_13m3mk15c8cdk.R.inc(159);if((((language == null)&&(__CLR4_3_13m3mk15c8cdk.R.iget(160)!=0|true))||(__CLR4_3_13m3mk15c8cdk.R.iget(161)==0&false)))
            {__CLR4_3_13m3mk15c8cdk.R.inc(162);language = new HashMap<String,String>();
    }}finally{__CLR4_3_13m3mk15c8cdk.R.flushNeeded();}}

}
