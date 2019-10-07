/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import Controll.Bejelentkezes.LoginPhase;
import Modell.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginPhaseTest {static class __CLR4_3_11jt1jtk1g7w64u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1570440781291L,8589935092L,2027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private LoginPhase loginPhase;
    private Map<String,User> testAccounts;

    @Before
    public void setUp(){try{__CLR4_3_11jt1jtk1g7w64u.R.inc(2009);
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2010);loginPhase = new LoginPhase();
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2011);testAccounts = new HashMap<>();
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2012);testAccounts.put("Test",new User());
    }finally{__CLR4_3_11jt1jtk1g7w64u.R.flushNeeded();}}

    @After
    public void tearDown(){try{__CLR4_3_11jt1jtk1g7w64u.R.inc(2013);
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2014);loginPhase = null;
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2015);testAccounts = null;
    }finally{__CLR4_3_11jt1jtk1g7w64u.R.flushNeeded();}}

    @Test
    public void testValidatePassword(){__CLR4_3_11jt1jtk1g7w64u.R.globalSliceStart(getClass().getName(),2016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1q7qmc61k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_11jt1jtk1g7w64u.R.rethrow($CLV_t2$);}finally{__CLR4_3_11jt1jtk1g7w64u.R.globalSliceEnd(getClass().getName(),"LoginPhaseTest.testValidatePassword",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),2016,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1q7qmc61k0(){try{__CLR4_3_11jt1jtk1g7w64u.R.inc(2016);
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2017);String testAccName = "tester02";
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2018);String test01 = "Ac241acx";
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2019);String test02 = "AcvpasvmnopasnvopSP\u00daFSCP\u00daASmcp\u00far\u00fc\u00f31i\u00fc\u00f642194u128if";
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2020);String test03 = "$asfcacsa";
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2021);String test04 = "asfasfa$fsafasfa";

        __CLR4_3_11jt1jtk1g7w64u.R.inc(2022);Assert.assertEquals(true,loginPhase.validatePassword(test01,testAccName,testAccounts));
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2023);Assert.assertEquals(false,loginPhase.validatePassword(test02,testAccName,testAccounts));
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2024);Assert.assertEquals(false,loginPhase.validatePassword(test03,testAccName,testAccounts));
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2025);Assert.assertEquals(false,loginPhase.validatePassword(test04,testAccName,testAccounts));
        __CLR4_3_11jt1jtk1g7w64u.R.inc(2026);Assert.assertEquals(false,loginPhase.validatePassword(test01,"tester01",testAccounts));
    }finally{__CLR4_3_11jt1jtk1g7w64u.R.flushNeeded();}}
}
