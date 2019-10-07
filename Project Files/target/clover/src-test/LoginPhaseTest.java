/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import Controll.Bejelentkezes.LoginPhase;
import Modell.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginPhaseTest {static class __CLR4_3_11oi1oik1gaw8ir{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1570445823149L,8589935092L,2203,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private LoginPhase loginPhase;
    private Map<String,User> testAccounts;

    @Before
    public void setUp(){try{__CLR4_3_11oi1oik1gaw8ir.R.inc(2178);
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2179);loginPhase = new LoginPhase();
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2180);testAccounts = new HashMap<>();
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2181);testAccounts.put("Test",new User());
    }finally{__CLR4_3_11oi1oik1gaw8ir.R.flushNeeded();}}

    @After
    public void tearDown(){try{__CLR4_3_11oi1oik1gaw8ir.R.inc(2182);
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2183);loginPhase = null;
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2184);testAccounts = null;
    }finally{__CLR4_3_11oi1oik1gaw8ir.R.flushNeeded();}}

    @Test
    public void testValidatePassword(){__CLR4_3_11oi1oik1gaw8ir.R.globalSliceStart(getClass().getName(),2185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1q7qmc61op();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_11oi1oik1gaw8ir.R.rethrow($CLV_t2$);}finally{__CLR4_3_11oi1oik1gaw8ir.R.globalSliceEnd(getClass().getName(),"LoginPhaseTest.testValidatePassword",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),2185,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1q7qmc61op(){try{__CLR4_3_11oi1oik1gaw8ir.R.inc(2185);
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2186);String testAccName = "tester02";
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2187);String test01 = "Ac241acx";
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2188);String test02 = "AcvpasvmnopasnvopSP\u00daFSCP\u00daASmcp\u00far\u00fc\u00f31i\u00fc\u00f642194u128if";
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2189);String test03 = "$asfcacsa";
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2190);String test04 = "asfasfa$fsafasfa";
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2191);String test05="1234567891011120";

        __CLR4_3_11oi1oik1gaw8ir.R.inc(2192);Assert.assertEquals(true,loginPhase.validatePassword(test01,testAccName,testAccounts)); //Egy valid password tesztel\u00e9se
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2193);Assert.assertEquals(false,loginPhase.validatePassword(test02,testAccName,testAccounts)); //A maxim\u00e1lisn\u00e1l hosszabb jelsz\u00f3 elfogad\u00e1s\u00e1nak tesztel\u00e9se
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2194);Assert.assertEquals(false,loginPhase.validatePassword(test03,testAccName,testAccounts)); //Speci\u00e1lis karakter a jelsz\u00f3 elej\u00e9n
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2195);Assert.assertEquals(false,loginPhase.validatePassword(test04,testAccName,testAccounts)); //Speci\u00e1lis karakter a jelsz\u00f3 k\u00f6zep\u00e9n
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2196);Assert.assertEquals(true,loginPhase.validatePassword(test05,testAccName,testAccounts)); //\u00c9ppen a megengedett hossz\u00fas\u00e1g\u00fa jelsz\u00f3
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2197);Assert.assertEquals(false,loginPhase.validatePassword(test01,"tester01",testAccounts)); //M\u00e1r haszn\u00e1latban l\u00e9v\u0151 felhaszn\u00e1l\u00f3n\u00e9v tesztel\u00e9se
    }finally{__CLR4_3_11oi1oik1gaw8ir.R.flushNeeded();}}

    @Test
    public void TestCoders(){__CLR4_3_11oi1oik1gaw8ir.R.globalSliceStart(getClass().getName(),2198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1jjdl31p2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_11oi1oik1gaw8ir.R.rethrow($CLV_t2$);}finally{__CLR4_3_11oi1oik1gaw8ir.R.globalSliceEnd(getClass().getName(),"LoginPhaseTest.TestCoders",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),2198,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1jjdl31p2(){try{__CLR4_3_11oi1oik1gaw8ir.R.inc(2198);
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2199);String testPasswd = "Hello123";

        __CLR4_3_11oi1oik1gaw8ir.R.inc(2200);Assert.assertNotNull(loginPhase.hasher(testPasswd)); //M\u0171k\u00f6dik-e a f\u00fcggv\u00e9ny
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2201);Assert.assertEquals("npnpnipibnvajoofaHello123phuboanovnipkanvp",loginPhase.hasher(testPasswd)); //hashell\u00e9s sikeress\u00e9g\u00e9nek ellen\u0151rz\u00e9se
        __CLR4_3_11oi1oik1gaw8ir.R.inc(2202);Assert.assertSame(testPasswd,loginPhase.hasher(testPasswd)); //Tesz-e valamit a stringhez

    }finally{__CLR4_3_11oi1oik1gaw8ir.R.flushNeeded();}}
}
