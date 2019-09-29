/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TanulasController {public static class __CLR4_3_12r2rk1502ym3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u0066\u005f\u0045\u0067\u0079\u0065\u0074\u0065\u006d\u002f\u0056\u002e\u0066\u00e9\u006c\u00e9\u0076\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u00e9\u0073\u0069\u0020\u006d\u00f3\u0064\u0073\u007a\u0065\u0072\u0074\u0061\u006e\u006f\u006b\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569762532547L,8589935092L,126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

        Stage testStage;
        public Button prevButt,testButt,nextButt,quitButt;

    public void handleTestButtonClicked() throws Exception{try{__CLR4_3_12r2rk1502ym3.R.inc(99);
        __CLR4_3_12r2rk1502ym3.R.inc(100);Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Kikerdez.fxml"));
        __CLR4_3_12r2rk1502ym3.R.inc(101);testStage = new Stage();
        __CLR4_3_12r2rk1502ym3.R.inc(102);testStage.setTitle("Tanul\u00e1s");
        __CLR4_3_12r2rk1502ym3.R.inc(103);testStage.setScene(new Scene(parent, 600, 400));
        __CLR4_3_12r2rk1502ym3.R.inc(104);testStage.show();
    }finally{__CLR4_3_12r2rk1502ym3.R.flushNeeded();}}

    public void changeButtonColor(){try{__CLR4_3_12r2rk1502ym3.R.inc(105);
        __CLR4_3_12r2rk1502ym3.R.inc(106);if ((((prevButt.isHover())&&(__CLR4_3_12r2rk1502ym3.R.iget(107)!=0|true))||(__CLR4_3_12r2rk1502ym3.R.iget(108)==0&false))){{
            __CLR4_3_12r2rk1502ym3.R.inc(109);prevButt.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_12r2rk1502ym3.R.inc(110);if ((((testButt.isHover())&&(__CLR4_3_12r2rk1502ym3.R.iget(111)!=0|true))||(__CLR4_3_12r2rk1502ym3.R.iget(112)==0&false))){{
            __CLR4_3_12r2rk1502ym3.R.inc(113);testButt.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_12r2rk1502ym3.R.inc(114);if ((((nextButt.isHover())&&(__CLR4_3_12r2rk1502ym3.R.iget(115)!=0|true))||(__CLR4_3_12r2rk1502ym3.R.iget(116)==0&false))) {{
            __CLR4_3_12r2rk1502ym3.R.inc(117);nextButt.setStyle("-fx-background-color: #b9865d");
        }}else{{
            __CLR4_3_12r2rk1502ym3.R.inc(118);quitButt.setStyle("-fx-background-color: #b9865d");
        }
    }}}}finally{__CLR4_3_12r2rk1502ym3.R.flushNeeded();}}

    public void changeBackColor(){try{__CLR4_3_12r2rk1502ym3.R.inc(119);
        __CLR4_3_12r2rk1502ym3.R.inc(120);prevButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_12r2rk1502ym3.R.inc(121);testButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_12r2rk1502ym3.R.inc(122);nextButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_12r2rk1502ym3.R.inc(123);quitButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_12r2rk1502ym3.R.flushNeeded();}}

    public void quitButtClicked() throws Exception {try{__CLR4_3_12r2rk1502ym3.R.inc(124);
        __CLR4_3_12r2rk1502ym3.R.inc(125);System.exit(0);
    }finally{__CLR4_3_12r2rk1502ym3.R.flushNeeded();}}

}
