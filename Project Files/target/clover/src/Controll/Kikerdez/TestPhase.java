/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controll.Kikerdez;

import Controller.KikerdezController;
import Controller.TanulasController;
import javafx.scene.text.Text;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestPhase implements Test {static class __CLR4_3_11hi1hik16dffg3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569845416052L,8589935092L,1966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String,String> allWord = TanulasController.language;

    private Map<String,Integer> was = new HashMap<>();

    public static  Map<String,String> learned = new HashMap<>();

    public Map<String, String> getLearned() {try{__CLR4_3_11hi1hik16dffg3.R.inc(1926);
        __CLR4_3_11hi1hik16dffg3.R.inc(1927);return null;
    }finally{__CLR4_3_11hi1hik16dffg3.R.flushNeeded();}}

    /***
     * A v\u00e1lasz helyess\u00e9g\u00e9t vizsg\u00e1lja
     * @param key A kulcs \u00e9rtk\u00e9k a k\u00e9rt v\u00e1laszb\u00f3l
     * @param value Az \u00e9rt\u00e9k-r\u00e9sze v\u00e1lasz r\u00e9sznek
     * @return Ha helyes a v\u00e1lasz igaz,ha nem,hamis
     */
    private boolean checkCorrect(String key, String value){try{__CLR4_3_11hi1hik16dffg3.R.inc(1928);
        __CLR4_3_11hi1hik16dffg3.R.inc(1929);if((((allWord.containsKey(key.toLowerCase()))&&(__CLR4_3_11hi1hik16dffg3.R.iget(1930)!=0|true))||(__CLR4_3_11hi1hik16dffg3.R.iget(1931)==0&false))){{
            __CLR4_3_11hi1hik16dffg3.R.inc(1932);return allWord.get(key.toLowerCase()).equals(value.toLowerCase());
        }}else{{
            __CLR4_3_11hi1hik16dffg3.R.inc(1933);return false;
        }

    }}finally{__CLR4_3_11hi1hik16dffg3.R.flushNeeded();}}

    /***
     * \u00d6sszefoglalja a v\u00e1laszkezel\u0151 f\u00fcggv\u00e9nyeket
     * @param key A kulcs \u00e9rtk\u00e9k a k\u00e9rt v\u00e1laszb\u00f3l
     * @param value Az \u00e9rt\u00e9k-r\u00e9sze v\u00e1lasz r\u00e9sznek
     * @param helyes A helyes v\u00e1laszt megjelen\u00edt\u0151 Text r\u00e9sz ha helytelen a v\u00e1lasz
     */
    public void checkAnswer(String key,String value,Text helyes){try{__CLR4_3_11hi1hik16dffg3.R.inc(1934);
        __CLR4_3_11hi1hik16dffg3.R.inc(1935);checkAndAdd(key,value,helyes);
    }finally{__CLR4_3_11hi1hik16dffg3.R.flushNeeded();}}

    /***
     * K\u00fcl\u00f6ngy\u0171jti a m\u00e1r megtanult szavakat.
     * @param key V\u00e1lasz kulcs
     * @param value V\u00e1lasz \u00e9rt\u00e9k
     * @param helyes A helyes v\u00e1laszt megjelen\u00edt\u0151 Text r\u00e9sz ha helytelen a v\u00e1lasz
     */
    private void checkAndAdd(String key,String value,Text helyes){try{__CLR4_3_11hi1hik16dffg3.R.inc(1936);

        __CLR4_3_11hi1hik16dffg3.R.inc(1937);if((((was.containsKey(key))&&(__CLR4_3_11hi1hik16dffg3.R.iget(1938)!=0|true))||(__CLR4_3_11hi1hik16dffg3.R.iget(1939)==0&false))){{

           __CLR4_3_11hi1hik16dffg3.R.inc(1940);if((((checkCorrect(key,value))&&(__CLR4_3_11hi1hik16dffg3.R.iget(1941)!=0|true))||(__CLR4_3_11hi1hik16dffg3.R.iget(1942)==0&false))) {{
               __CLR4_3_11hi1hik16dffg3.R.inc(1943);was.put(key, was.get(key) + 1);
               __CLR4_3_11hi1hik16dffg3.R.inc(1944);setOnAnsw(key,value,helyes);
           }

            }__CLR4_3_11hi1hik16dffg3.R.inc(1945);if((((was.get(key) == 2)&&(__CLR4_3_11hi1hik16dffg3.R.iget(1946)!=0|true))||(__CLR4_3_11hi1hik16dffg3.R.iget(1947)==0&false)))
                {__CLR4_3_11hi1hik16dffg3.R.inc(1948);learned.put(key,allWord.get(key));

        }}}else{{
            __CLR4_3_11hi1hik16dffg3.R.inc(1949);if((((checkCorrect(key,value))&&(__CLR4_3_11hi1hik16dffg3.R.iget(1950)!=0|true))||(__CLR4_3_11hi1hik16dffg3.R.iget(1951)==0&false))) {{
                __CLR4_3_11hi1hik16dffg3.R.inc(1952);was.put(key, 1);
                __CLR4_3_11hi1hik16dffg3.R.inc(1953);setOnAnsw(key,value,helyes);
            }
            }else {{
                __CLR4_3_11hi1hik16dffg3.R.inc(1954);was.put(key, 0);
                __CLR4_3_11hi1hik16dffg3.R.inc(1955);setOnAnsw(key,value, helyes);
            }
        }}

    }}finally{__CLR4_3_11hi1hik16dffg3.R.flushNeeded();}}

    /***
     * A v\u00e1lasz helyess\u00e9g\u00e9t\u0151l f\u00fcgg\u0151en \u00e1ll\u00edtja a visszajelz\u0151 sz\u00f6veget
     * @param key V\u00e1lasz kulcs
     * @param value V\u00e1lasz \u00e9rt\u00e9k
     * @param toSet A helyes v\u00e1laszt megjelen\u00edt\u0151 Text r\u00e9sz ha helytelen a v\u00e1lasz
     */
    private void setOnAnsw(String key,String value, Text toSet){try{__CLR4_3_11hi1hik16dffg3.R.inc(1956);
        __CLR4_3_11hi1hik16dffg3.R.inc(1957);if((((checkCorrect(key,value))&&(__CLR4_3_11hi1hik16dffg3.R.iget(1958)!=0|true))||(__CLR4_3_11hi1hik16dffg3.R.iget(1959)==0&false))){{
            __CLR4_3_11hi1hik16dffg3.R.inc(1960);toSet.setText("Helyes v\u00e1lasz");
        }}else{{
            __CLR4_3_11hi1hik16dffg3.R.inc(1961);if((((allWord.containsKey(key))&&(__CLR4_3_11hi1hik16dffg3.R.iget(1962)!=0|true))||(__CLR4_3_11hi1hik16dffg3.R.iget(1963)==0&false)))
                {__CLR4_3_11hi1hik16dffg3.R.inc(1964);toSet.setText("Helytelen v\u00e1lasz, helyes v\u00e1lasz: \n" + key + " - " + allWord.get(key));
            }else
                {__CLR4_3_11hi1hik16dffg3.R.inc(1965);toSet.setText("Helytelen v\u00e1lasz, helyes v\u00e1lasz: \n" + allWord.keySet().stream().filter(k -> allWord.get(k).equals(value)).collect(Collectors.toList()).get(0) + " - " + value);
        }}
    }}finally{__CLR4_3_11hi1hik16dffg3.R.flushNeeded();}}

}
