/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controll.Kikerdez;

import Controller.TanulasController;

import java.util.HashMap;
import java.util.Map;

public class TestPhase implements Test {static class __CLR4_3_1cck15c8c7g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569782939530L,8589935092L,38,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String,String> allWord = TanulasController.language;

    private Map<String,Integer> was = new HashMap<>();

    public static  Map<String,String> learned = new HashMap<>();

    public Map<String, String> getLearned() {try{__CLR4_3_1cck15c8c7g.R.inc(12);
        __CLR4_3_1cck15c8c7g.R.inc(13);return null;
    }finally{__CLR4_3_1cck15c8c7g.R.flushNeeded();}}

    private boolean checkCorrect(String key, String value){try{__CLR4_3_1cck15c8c7g.R.inc(14);

        __CLR4_3_1cck15c8c7g.R.inc(15);if((((allWord.containsKey(key.toLowerCase()))&&(__CLR4_3_1cck15c8c7g.R.iget(16)!=0|true))||(__CLR4_3_1cck15c8c7g.R.iget(17)==0&false))){{
            __CLR4_3_1cck15c8c7g.R.inc(18);return allWord.get(key.toLowerCase()) == value.toLowerCase();
        }}else{{
            __CLR4_3_1cck15c8c7g.R.inc(19);return false;
        }

    }}finally{__CLR4_3_1cck15c8c7g.R.flushNeeded();}}

    public String checkAnswer(String key,String value){try{__CLR4_3_1cck15c8c7g.R.inc(20);

        __CLR4_3_1cck15c8c7g.R.inc(21);checkAndAdd(key,value);

        __CLR4_3_1cck15c8c7g.R.inc(22);for(Map.Entry<String,Integer> entry: was.entrySet()){{
            __CLR4_3_1cck15c8c7g.R.inc(23);System.out.println("Key: " + entry.getKey() + "\nValue: " +entry.getValue() + "\n");
        }


        }__CLR4_3_1cck15c8c7g.R.inc(24);return null;

    }finally{__CLR4_3_1cck15c8c7g.R.flushNeeded();}}

    private void checkAndAdd(String key,String value){try{__CLR4_3_1cck15c8c7g.R.inc(25);

        __CLR4_3_1cck15c8c7g.R.inc(26);if((((was.containsKey(key))&&(__CLR4_3_1cck15c8c7g.R.iget(27)!=0|true))||(__CLR4_3_1cck15c8c7g.R.iget(28)==0&false))){{

            __CLR4_3_1cck15c8c7g.R.inc(29);Object o = ((((checkCorrect(key,value)) )&&(__CLR4_3_1cck15c8c7g.R.iget(30)!=0|true))||(__CLR4_3_1cck15c8c7g.R.iget(31)==0&false))? was.put(key,was.get(key)+1) : null;

            __CLR4_3_1cck15c8c7g.R.inc(32);o = ((((was.get(key) == 2) )&&(__CLR4_3_1cck15c8c7g.R.iget(33)!=0|true))||(__CLR4_3_1cck15c8c7g.R.iget(34)==0&false))? learned.put(key,value) : null;

        }}else{{

            __CLR4_3_1cck15c8c7g.R.inc(35);Object o = ((((checkCorrect(key,value)) )&&(__CLR4_3_1cck15c8c7g.R.iget(36)!=0|true))||(__CLR4_3_1cck15c8c7g.R.iget(37)==0&false))? was.put(key,1) : was.put(key,0);

        }

    }}finally{__CLR4_3_1cck15c8c7g.R.flushNeeded();}}

}
