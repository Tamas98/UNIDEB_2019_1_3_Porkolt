/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controll.Bejelentkezes;

import Controll.fileHandler.JsonWriter;
import Modell.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LoginPhase implements Login {public static class __CLR4_3_11gr1grk16dffey{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569845416052L,8589935092L,1926,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String hash1 = "npnpnipibnvajoofa";
    private String hash2 = "phuboanovnipkanvp";

    private JsonWriter jsonWriter = new JsonWriter("/Assets/users.json");


    /***
     *Ellen\u0151rzi, megfelel-e a megadott krit\u00e9riumoknak a felhaszn\u00e1l\u00f3 jelszava
     * @param passwd A felhaszn\u00e1l\u00f3 \u00e1ltal haszn\u00e1lni k\u00edv\u00e1nt jelsz\u00f3
     * @param uname A felhaszn\u00e1l\u00f3 \u00e1ltal haszn\u00e1lni k\u00edv\u00e1nt felhaszn\u00e1l\u00f3n\u00e9v
     * @param users A m\u00e1r beregisztr\u00e1lt felhaszn\u00e1l\u00f3k list\u00e1ja
     * @return igaz,ha m\u00e9g nem foglalt a felhaszn\u00e1l\u00f3n\u00e9v, a jelsz\u00f3 hossza 16 alatt van \u00e9s csak a-t\u00f3l z-ig kics vagy nagy bet\u0171ket tartalmaz,illetve sz\u00e1mokat
     */
    @Override
    public boolean validatePassword(String passwd,String uname,Map<String,User> users) {try{__CLR4_3_11gr1grk16dffey.R.inc(1899);
        __CLR4_3_11gr1grk16dffey.R.inc(1900);if((((passwd.matches("[0-9A-Za-z]*") && !users.containsValue(users.get(hasher(passwd))) && passwd.length() <= 16)&&(__CLR4_3_11gr1grk16dffey.R.iget(1901)!=0|true))||(__CLR4_3_11gr1grk16dffey.R.iget(1902)==0&false))){{
            __CLR4_3_11gr1grk16dffey.R.inc(1903);User newUser = new User(uname,"0000",new HashMap<String,String>());
            __CLR4_3_11gr1grk16dffey.R.inc(1904);users.put(hasher(passwd),newUser);
            __CLR4_3_11gr1grk16dffey.R.inc(1905);jsonWriter.writeToJson(users);
            __CLR4_3_11gr1grk16dffey.R.inc(1906);return true;
        }
        }else{{
            __CLR4_3_11gr1grk16dffey.R.inc(1907);return false;
        }
    }}finally{__CLR4_3_11gr1grk16dffey.R.flushNeeded();}}

    /**
     * K\u00f3dolja a felhaszn\u00e1l\u00f3 jelszav\u00e1t \u00e9s hozz\u00e1f\u0171z 2 hash-t
     * @param passwd A felhaszn\u00e1l\u00f3 jelszava
     * @return a hashelt \u00e9s k\u00f3dolt jelsz\u00f3
     */
    @Override
    public String hasher(String passwd) {try{__CLR4_3_11gr1grk16dffey.R.inc(1908);
        __CLR4_3_11gr1grk16dffey.R.inc(1909);return hash1 +  caesarCoder(passwd) + hash2;
    }finally{__CLR4_3_11gr1grk16dffey.R.flushNeeded();}}

    /***
     * Caesar k\u00f3dol\u00f3t haszn\u00e1lva k\u00f3dolja a jelsz\u00f3t
     * @param passwd A felhaszn\u00e1l\u00f3 jelszava
     * @return a Caesar k\u00f3dolt jelsz\u00f3
     */
    private StringBuffer caesarCoder(String passwd) {try{__CLR4_3_11gr1grk16dffey.R.inc(1910);
    	__CLR4_3_11gr1grk16dffey.R.inc(1911);int s = 5;
        __CLR4_3_11gr1grk16dffey.R.inc(1912);StringBuffer result= new StringBuffer(); 
  
        __CLR4_3_11gr1grk16dffey.R.inc(1913);for (int i=0; (((i<passwd.length())&&(__CLR4_3_11gr1grk16dffey.R.iget(1914)!=0|true))||(__CLR4_3_11gr1grk16dffey.R.iget(1915)==0&false)); i++) 
        {{ 
            __CLR4_3_11gr1grk16dffey.R.inc(1916);if ((((Character.isUpperCase(passwd.charAt(i)))&&(__CLR4_3_11gr1grk16dffey.R.iget(1917)!=0|true))||(__CLR4_3_11gr1grk16dffey.R.iget(1918)==0&false))) 
            {{ 
                __CLR4_3_11gr1grk16dffey.R.inc(1919);char ch = (char)(((int)passwd.charAt(i) + 
                                  s - 65) % 26 + 65); 
                __CLR4_3_11gr1grk16dffey.R.inc(1920);result.append(ch); 
            } 
            }else
            {{ 
                __CLR4_3_11gr1grk16dffey.R.inc(1921);char ch = (char)(((int)passwd.charAt(i) + 
                                  s - 97) % 26 + 97); 
                __CLR4_3_11gr1grk16dffey.R.inc(1922);result.append(ch); 
            } 
        }} 
        }__CLR4_3_11gr1grk16dffey.R.inc(1923);return result;
    }finally{__CLR4_3_11gr1grk16dffey.R.flushNeeded();}}

    @Override
    public String deCoder(String passwd) {try{__CLR4_3_11gr1grk16dffey.R.inc(1924);
        __CLR4_3_11gr1grk16dffey.R.inc(1925);return null;
    }finally{__CLR4_3_11gr1grk16dffey.R.flushNeeded();}}
}
