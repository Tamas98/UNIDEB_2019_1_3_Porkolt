/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controll.Kikerdez;

import Controller.KikerdezController;
import Controller.TanulasController;
import javafx.scene.text.Text;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestPhase implements Test {static class __CLR4_3_12an2ank15n4kjw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569801239489L,8589935092L,3018,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String,String> allWord = TanulasController.language;

    private Map<String,Integer> was = new HashMap<>();

    public static  Map<String,String> learned = new HashMap<>();

    public Map<String, String> getLearned() {try{__CLR4_3_12an2ank15n4kjw.R.inc(2975);
        __CLR4_3_12an2ank15n4kjw.R.inc(2976);return null;
    }finally{__CLR4_3_12an2ank15n4kjw.R.flushNeeded();}}

    private boolean checkCorrect(String key, String value){try{__CLR4_3_12an2ank15n4kjw.R.inc(2977);
        __CLR4_3_12an2ank15n4kjw.R.inc(2978);if((((allWord.containsKey(key.toLowerCase()))&&(__CLR4_3_12an2ank15n4kjw.R.iget(2979)!=0|true))||(__CLR4_3_12an2ank15n4kjw.R.iget(2980)==0&false))){{
            __CLR4_3_12an2ank15n4kjw.R.inc(2981);return allWord.get(key.toLowerCase()).equals(value.toLowerCase());
        }}else{{
            __CLR4_3_12an2ank15n4kjw.R.inc(2982);return false;
        }

    }}finally{__CLR4_3_12an2ank15n4kjw.R.flushNeeded();}}

    public void checkAnswer(String key,String value,Text helyes){try{__CLR4_3_12an2ank15n4kjw.R.inc(2983);
        __CLR4_3_12an2ank15n4kjw.R.inc(2984);checkAndAdd(key,value,helyes);

        __CLR4_3_12an2ank15n4kjw.R.inc(2985);for(Map.Entry<String,Integer> entry: was.entrySet()){{
            __CLR4_3_12an2ank15n4kjw.R.inc(2986);System.out.println("Key: " + entry.getKey() + "\nValue: " +entry.getValue() + "\n");
        }

        }__CLR4_3_12an2ank15n4kjw.R.inc(2987);System.out.println("-----------------------------------------------------------------------");
    }finally{__CLR4_3_12an2ank15n4kjw.R.flushNeeded();}}

    private void checkAndAdd(String key,String value,Text helyes){try{__CLR4_3_12an2ank15n4kjw.R.inc(2988);

        __CLR4_3_12an2ank15n4kjw.R.inc(2989);if((((was.containsKey(key))&&(__CLR4_3_12an2ank15n4kjw.R.iget(2990)!=0|true))||(__CLR4_3_12an2ank15n4kjw.R.iget(2991)==0&false))){{

           __CLR4_3_12an2ank15n4kjw.R.inc(2992);if((((checkCorrect(key,value))&&(__CLR4_3_12an2ank15n4kjw.R.iget(2993)!=0|true))||(__CLR4_3_12an2ank15n4kjw.R.iget(2994)==0&false))) {{
               __CLR4_3_12an2ank15n4kjw.R.inc(2995);was.put(key, was.get(key) + 1);
               __CLR4_3_12an2ank15n4kjw.R.inc(2996);setOnShit(key,value,helyes);
           }

            }__CLR4_3_12an2ank15n4kjw.R.inc(2997);if((((was.get(key) == 2)&&(__CLR4_3_12an2ank15n4kjw.R.iget(2998)!=0|true))||(__CLR4_3_12an2ank15n4kjw.R.iget(2999)==0&false)))
                {__CLR4_3_12an2ank15n4kjw.R.inc(3000);learned.put(key,allWord.get(key));

        }}}else{{
            __CLR4_3_12an2ank15n4kjw.R.inc(3001);if((((checkCorrect(key,value))&&(__CLR4_3_12an2ank15n4kjw.R.iget(3002)!=0|true))||(__CLR4_3_12an2ank15n4kjw.R.iget(3003)==0&false))) {{
                __CLR4_3_12an2ank15n4kjw.R.inc(3004);was.put(key, 1);
                __CLR4_3_12an2ank15n4kjw.R.inc(3005);setOnShit(key,value,helyes);
            }
            }else {{
                __CLR4_3_12an2ank15n4kjw.R.inc(3006);was.put(key, 0);
                __CLR4_3_12an2ank15n4kjw.R.inc(3007);setOnShit(key,value, helyes);
            }
        }}

    }}finally{__CLR4_3_12an2ank15n4kjw.R.flushNeeded();}}

    private void setOnShit(String key,String value, Text toSet){try{__CLR4_3_12an2ank15n4kjw.R.inc(3008);
        __CLR4_3_12an2ank15n4kjw.R.inc(3009);if((((checkCorrect(key,value))&&(__CLR4_3_12an2ank15n4kjw.R.iget(3010)!=0|true))||(__CLR4_3_12an2ank15n4kjw.R.iget(3011)==0&false))){{
            __CLR4_3_12an2ank15n4kjw.R.inc(3012);toSet.setText("Helyes V\u00e1laszt");
        }}else{{
            __CLR4_3_12an2ank15n4kjw.R.inc(3013);if((((allWord.containsKey(key))&&(__CLR4_3_12an2ank15n4kjw.R.iget(3014)!=0|true))||(__CLR4_3_12an2ank15n4kjw.R.iget(3015)==0&false)))
                {__CLR4_3_12an2ank15n4kjw.R.inc(3016);toSet.setText("Helytelen v\u00e1lasz, helyes v\u00e1lasz: \n" + key + " - " + allWord.get(key));
            }else
                {__CLR4_3_12an2ank15n4kjw.R.inc(3017);toSet.setText("Helytelen v\u00e1lasz, helyes v\u00e1lasz: \n" + allWord.keySet().stream().filter(k -> allWord.get(k).equals(value)).collect(Collectors.toList()).get(0) + " - " + value);
        }}
    }}finally{__CLR4_3_12an2ank15n4kjw.R.flushNeeded();}}

}
