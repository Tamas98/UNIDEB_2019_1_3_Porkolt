/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controller;

import Controll.Kikerdez.TestPhase;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import com.google.gson.reflect.TypeToken;
import Controll.fileHandler.JsonReader;
import Controll.fileHandler.ReadFile;
import javafx.scene.control.TextField;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import Controll.Learning.LearningMethod;
import javafx.scene.text.Text;

public class KikerdezController extends TestPhase implements Initializable {public static class __CLR4_3_12an2ank15n5c2z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569801275186L,8589935092L,3004,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Type token = new TypeToken<Map<String, String>>(){}.getType();

    private ReadFile jsonReader = new JsonReader("/Assets/english.json",token);

    private Random random = new Random();

    @FXML
    public Button nextButt,quitButt;

    @FXML
    public Text helyes;

    @FXML
    public TextField askedOne,anotherOne;

    public void changeButtonColor() {try{__CLR4_3_12an2ank15n5c2z.R.inc(2975);
        __CLR4_3_12an2ank15n5c2z.R.inc(2976);if ((((nextButt.isHover())&&(__CLR4_3_12an2ank15n5c2z.R.iget(2977)!=0|true))||(__CLR4_3_12an2ank15n5c2z.R.iget(2978)==0&false))) {{
            __CLR4_3_12an2ank15n5c2z.R.inc(2979);nextButt.setStyle("-fx-background-color: #b9865d");
        } }else {{
            __CLR4_3_12an2ank15n5c2z.R.inc(2980);quitButt.setStyle("-fx-background-color: #b9865d");
        }
    }}finally{__CLR4_3_12an2ank15n5c2z.R.flushNeeded();}}

    public void changeBackColor() {try{__CLR4_3_12an2ank15n5c2z.R.inc(2981);
        __CLR4_3_12an2ank15n5c2z.R.inc(2982);nextButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_12an2ank15n5c2z.R.inc(2983);quitButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_12an2ank15n5c2z.R.flushNeeded();}}

    public void quitButtClicked() throws Exception {try{__CLR4_3_12an2ank15n5c2z.R.inc(2984);
        __CLR4_3_12an2ank15n5c2z.R.inc(2985);System.exit(0);
    }finally{__CLR4_3_12an2ank15n5c2z.R.flushNeeded();}}

    @FXML
    public void checkAnsw() {try{__CLR4_3_12an2ank15n5c2z.R.inc(2986);
        __CLR4_3_12an2ank15n5c2z.R.inc(2987);checkAnswer(anotherOne.getText(),askedOne.getText(),helyes);

        __CLR4_3_12an2ank15n5c2z.R.inc(2988);anotherOne.setDisable(false);
        __CLR4_3_12an2ank15n5c2z.R.inc(2989);askedOne.setDisable(false);

        __CLR4_3_12an2ank15n5c2z.R.inc(2990);String nextKey = LearningMethod.fixKeys.get(random.nextInt(10));

        __CLR4_3_12an2ank15n5c2z.R.inc(2991);if((((random.nextInt(10) < 5)&&(__CLR4_3_12an2ank15n5c2z.R.iget(2992)!=0|true))||(__CLR4_3_12an2ank15n5c2z.R.iget(2993)==0&false))){{
            __CLR4_3_12an2ank15n5c2z.R.inc(2994);anotherOne.setDisable(true);
            __CLR4_3_12an2ank15n5c2z.R.inc(2995);anotherOne.setText(nextKey);
            __CLR4_3_12an2ank15n5c2z.R.inc(2996);askedOne.setText("");
        }}else{{
            __CLR4_3_12an2ank15n5c2z.R.inc(2997);askedOne.setDisable(true);
            __CLR4_3_12an2ank15n5c2z.R.inc(2998);askedOne.setText(LearningMethod.FinalMap.get(nextKey));
            __CLR4_3_12an2ank15n5c2z.R.inc(2999);anotherOne.setText("");
        }
    }}finally{__CLR4_3_12an2ank15n5c2z.R.flushNeeded();}}




    @Override
    public void initialize(URL location, ResourceBundle resources) {try{__CLR4_3_12an2ank15n5c2z.R.inc(3000);

       __CLR4_3_12an2ank15n5c2z.R.inc(3001);String starter = LearningMethod.FinalMap.keySet().stream().collect(Collectors.toList()).get(random.nextInt(10));

       __CLR4_3_12an2ank15n5c2z.R.inc(3002);anotherOne.setText(starter);
       __CLR4_3_12an2ank15n5c2z.R.inc(3003);anotherOne.setDisable(true);

    }finally{__CLR4_3_12an2ank15n5c2z.R.flushNeeded();}}



}
