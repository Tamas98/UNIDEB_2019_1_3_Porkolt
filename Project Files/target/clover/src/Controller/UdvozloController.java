/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

<<<<<<< HEAD
public class UdvozloController {public static class __CLR4_3_14j4jk15c8ce8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569782939530L,8589935092L,198,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
=======
public class UdvozloController {public static class __CLR4_3_13i3ik1502ynh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u0066\u005f\u0045\u0067\u0079\u0065\u0074\u0065\u006d\u002f\u0056\u002e\u0066\u00e9\u006c\u00e9\u0076\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u00e9\u0073\u0069\u0020\u006d\u00f3\u0064\u0073\u007a\u0065\u0072\u0074\u0061\u006e\u006f\u006b\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569762532547L,8589935092L,161,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
>>>>>>> a27555872e8917161a7ac30b52a7f8fbf47ac828

    Stage newPassStage, chooseStage, regStage;
    public Button newPassButt, signIn, quitButt, regButt;
    public AnchorPane udvPane;

<<<<<<< HEAD
    public void handleNewPassButtonClicked() throws Exception{try{__CLR4_3_14j4jk15c8ce8.R.inc(163);
        __CLR4_3_14j4jk15c8ce8.R.inc(164);Parent newPassword = FXMLLoader.load(getClass().getResource("/fxml/Uj_jelszo.fxml"));
        __CLR4_3_14j4jk15c8ce8.R.inc(165);newPassStage = new Stage();
        __CLR4_3_14j4jk15c8ce8.R.inc(166);newPassStage.setTitle("Kezd\u0151k\u00e9perny\u0151");
        __CLR4_3_14j4jk15c8ce8.R.inc(167);newPassStage.setScene(new Scene(newPassword, 600, 200));
        __CLR4_3_14j4jk15c8ce8.R.inc(168);newPassStage.show();
    }finally{__CLR4_3_14j4jk15c8ce8.R.flushNeeded();}}


    public void handleLogInButtonClicked() throws Exception{try{__CLR4_3_14j4jk15c8ce8.R.inc(169);
        
        __CLR4_3_14j4jk15c8ce8.R.inc(170);Parent nxtWindow = FXMLLoader.load(getClass().getResource("/fxml/Nyelvvalasztas.fxml"));
        __CLR4_3_14j4jk15c8ce8.R.inc(171);chooseStage = new Stage();
        __CLR4_3_14j4jk15c8ce8.R.inc(172);chooseStage.setTitle("V\u00e1laszthat\u00f3 nyelvek");
        __CLR4_3_14j4jk15c8ce8.R.inc(173);chooseStage.setScene(new Scene(nxtWindow, 600, 400));
        __CLR4_3_14j4jk15c8ce8.R.inc(174);chooseStage.show();
        __CLR4_3_14j4jk15c8ce8.R.inc(175);udvPane.setVisible(false);
    }finally{__CLR4_3_14j4jk15c8ce8.R.flushNeeded();}}

    public void changeButtonColor(){try{__CLR4_3_14j4jk15c8ce8.R.inc(176);
        __CLR4_3_14j4jk15c8ce8.R.inc(177);if ((((signIn.isHover())&&(__CLR4_3_14j4jk15c8ce8.R.iget(178)!=0|true))||(__CLR4_3_14j4jk15c8ce8.R.iget(179)==0&false))){{
            __CLR4_3_14j4jk15c8ce8.R.inc(180);signIn.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_14j4jk15c8ce8.R.inc(181);if ((((quitButt.isHover())&&(__CLR4_3_14j4jk15c8ce8.R.iget(182)!=0|true))||(__CLR4_3_14j4jk15c8ce8.R.iget(183)==0&false))){{
            __CLR4_3_14j4jk15c8ce8.R.inc(184);quitButt.setStyle("-fx-background-color: #b9865d");
        }}else{{
            __CLR4_3_14j4jk15c8ce8.R.inc(185);newPassButt.setStyle("-fx-background-color: #b9865d");
        }
    }}}finally{__CLR4_3_14j4jk15c8ce8.R.flushNeeded();}}

    public void changeBackColor(){try{__CLR4_3_14j4jk15c8ce8.R.inc(186);
        __CLR4_3_14j4jk15c8ce8.R.inc(187);signIn.setStyle("-fx-background-color: #696969");
        __CLR4_3_14j4jk15c8ce8.R.inc(188);quitButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_14j4jk15c8ce8.R.inc(189);newPassButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_14j4jk15c8ce8.R.flushNeeded();}}

    public void quitButtClicked() throws Exception {try{__CLR4_3_14j4jk15c8ce8.R.inc(190);
        __CLR4_3_14j4jk15c8ce8.R.inc(191);System.exit(0);
    }finally{__CLR4_3_14j4jk15c8ce8.R.flushNeeded();}}

    public void regButtClicked() throws Exception {try{__CLR4_3_14j4jk15c8ce8.R.inc(192);
        __CLR4_3_14j4jk15c8ce8.R.inc(193);Parent regIster = FXMLLoader.load(getClass().getResource("/fxml/Regisztracio.fxml"));
        __CLR4_3_14j4jk15c8ce8.R.inc(194);regStage = new Stage();
        __CLR4_3_14j4jk15c8ce8.R.inc(195);regStage.setTitle("Regisztr\u00e1ci\u00f3");
        __CLR4_3_14j4jk15c8ce8.R.inc(196);regStage.setScene(new Scene(regIster, 600, 200));
        __CLR4_3_14j4jk15c8ce8.R.inc(197);regStage.show();
    }finally{__CLR4_3_14j4jk15c8ce8.R.flushNeeded();}}
=======
    public void handleNewPassButtonClicked() throws Exception{try{__CLR4_3_13i3ik1502ynh.R.inc(126);
        __CLR4_3_13i3ik1502ynh.R.inc(127);Parent newPassword = FXMLLoader.load(getClass().getResource("/fxml/Uj_jelszo.fxml"));
        __CLR4_3_13i3ik1502ynh.R.inc(128);newPassStage = new Stage();
        __CLR4_3_13i3ik1502ynh.R.inc(129);newPassStage.setTitle("Kezd\u0151k\u00e9perny\u0151");
        __CLR4_3_13i3ik1502ynh.R.inc(130);newPassStage.setScene(new Scene(newPassword, 600, 200));
        __CLR4_3_13i3ik1502ynh.R.inc(131);newPassStage.show();
    }finally{__CLR4_3_13i3ik1502ynh.R.flushNeeded();}}


    public void handleLogInButtonClicked() throws Exception{try{__CLR4_3_13i3ik1502ynh.R.inc(132);
        
        __CLR4_3_13i3ik1502ynh.R.inc(133);Parent nxtWindow = FXMLLoader.load(getClass().getResource("/fxml/Nyelvvalasztas.fxml"));
        __CLR4_3_13i3ik1502ynh.R.inc(134);chooseStage = new Stage();
        __CLR4_3_13i3ik1502ynh.R.inc(135);chooseStage.setTitle("V\u00e1laszthat\u00f3 nyelvek");
        __CLR4_3_13i3ik1502ynh.R.inc(136);chooseStage.setScene(new Scene(nxtWindow, 600, 400));
        __CLR4_3_13i3ik1502ynh.R.inc(137);chooseStage.show();
        __CLR4_3_13i3ik1502ynh.R.inc(138);udvPane.setVisible(false);
    }finally{__CLR4_3_13i3ik1502ynh.R.flushNeeded();}}

    public void changeButtonColor(){try{__CLR4_3_13i3ik1502ynh.R.inc(139);
        __CLR4_3_13i3ik1502ynh.R.inc(140);if ((((signIn.isHover())&&(__CLR4_3_13i3ik1502ynh.R.iget(141)!=0|true))||(__CLR4_3_13i3ik1502ynh.R.iget(142)==0&false))){{
            __CLR4_3_13i3ik1502ynh.R.inc(143);signIn.setStyle("-fx-background-color: #b9865d");
        }}else {__CLR4_3_13i3ik1502ynh.R.inc(144);if ((((quitButt.isHover())&&(__CLR4_3_13i3ik1502ynh.R.iget(145)!=0|true))||(__CLR4_3_13i3ik1502ynh.R.iget(146)==0&false))){{
            __CLR4_3_13i3ik1502ynh.R.inc(147);quitButt.setStyle("-fx-background-color: #b9865d");
        }}else{{
            __CLR4_3_13i3ik1502ynh.R.inc(148);newPassButt.setStyle("-fx-background-color: #b9865d");
        }
    }}}finally{__CLR4_3_13i3ik1502ynh.R.flushNeeded();}}

    public void changeBackColor(){try{__CLR4_3_13i3ik1502ynh.R.inc(149);
        __CLR4_3_13i3ik1502ynh.R.inc(150);signIn.setStyle("-fx-background-color: #696969");
        __CLR4_3_13i3ik1502ynh.R.inc(151);quitButt.setStyle("-fx-background-color: #696969");
        __CLR4_3_13i3ik1502ynh.R.inc(152);newPassButt.setStyle("-fx-background-color: #696969");
    }finally{__CLR4_3_13i3ik1502ynh.R.flushNeeded();}}

    public void quitButtClicked() throws Exception {try{__CLR4_3_13i3ik1502ynh.R.inc(153);
        __CLR4_3_13i3ik1502ynh.R.inc(154);System.exit(0);
    }finally{__CLR4_3_13i3ik1502ynh.R.flushNeeded();}}

    public void regButtClicked() throws Exception {try{__CLR4_3_13i3ik1502ynh.R.inc(155);
        __CLR4_3_13i3ik1502ynh.R.inc(156);Parent regIster = FXMLLoader.load(getClass().getResource("/fxml/Regisztracio.fxml"));
        __CLR4_3_13i3ik1502ynh.R.inc(157);regStage = new Stage();
        __CLR4_3_13i3ik1502ynh.R.inc(158);regStage.setTitle("Regisztr\u00e1ci\u00f3");
        __CLR4_3_13i3ik1502ynh.R.inc(159);regStage.setScene(new Scene(regIster, 600, 200));
        __CLR4_3_13i3ik1502ynh.R.inc(160);regStage.show();
    }finally{__CLR4_3_13i3ik1502ynh.R.flushNeeded();}}
>>>>>>> a27555872e8917161a7ac30b52a7f8fbf47ac828

}
