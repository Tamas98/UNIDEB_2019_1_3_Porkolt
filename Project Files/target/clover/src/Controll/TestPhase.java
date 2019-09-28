/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controll;

import java.util.Map;

public class TestPhase implements Test {static class __CLR4_3_1cck13c8ul1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u0066\u005f\u0045\u0067\u0079\u0065\u0074\u0065\u006d\u002f\u0056\u002e\u0066\u00e9\u006c\u00e9\u0076\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u00e9\u0073\u0069\u0020\u006d\u00f3\u0064\u0073\u007a\u0065\u0072\u0074\u0061\u006e\u006f\u006b\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569662030617L,8589935092L,22,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Map<String, String> getLearned() {try{__CLR4_3_1cck13c8ul1.R.inc(12);
        __CLR4_3_1cck13c8ul1.R.inc(13);return null;
    }finally{__CLR4_3_1cck13c8ul1.R.flushNeeded();}}

    public boolean testAnswer(Map<String,String> container,String word) {try{__CLR4_3_1cck13c8ul1.R.inc(14);
        __CLR4_3_1cck13c8ul1.R.inc(15);try{

            __CLR4_3_1cck13c8ul1.R.inc(16);if((((container.containsKey(word))&&(__CLR4_3_1cck13c8ul1.R.iget(17)!=0|true))||(__CLR4_3_1cck13c8ul1.R.iget(18)==0&false))){{

            }}else{{
                __CLR4_3_1cck13c8ul1.R.inc(19);container.values().stream().filter(e -> e.equals(word));
            }

            }__CLR4_3_1cck13c8ul1.R.inc(20);return true;
        }catch(Exception e){
            __CLR4_3_1cck13c8ul1.R.inc(21);return false;
        }

    }finally{__CLR4_3_1cck13c8ul1.R.flushNeeded();}}

}
