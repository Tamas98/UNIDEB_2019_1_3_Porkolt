/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controll.Learning;

import javafx.scene.text.Text;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class LearningMethod implements Learn {public static class __CLR4_3_11z1zk1gc1auv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1570447739092L,8589935092L,109,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

		public static List<String> fixKeys = new ArrayList<String>();

		public static Map<String,String> FinalMap = new HashMap<>();
		
		public Map<String,String> readFullMap() {try{__CLR4_3_11z1zk1gc1auv.R.inc(71);
			__CLR4_3_11z1zk1gc1auv.R.inc(72);return null;
		}finally{__CLR4_3_11z1zk1gc1auv.R.flushNeeded();}}

		public void get10Random(Map<String,String> full) {try{__CLR4_3_11z1zk1gc1auv.R.inc(73);

			__CLR4_3_11z1zk1gc1auv.R.inc(74);List<String> keys = new ArrayList<String>(full.keySet());
			__CLR4_3_11z1zk1gc1auv.R.inc(75);int x = 10;
			
			__CLR4_3_11z1zk1gc1auv.R.inc(76);if((((full.size() <= 10)&&(__CLR4_3_11z1zk1gc1auv.R.iget(77)!=0|true))||(__CLR4_3_11z1zk1gc1auv.R.iget(78)==0&false))) {{
				__CLR4_3_11z1zk1gc1auv.R.inc(79);x = full.size();
			}
			
			}__CLR4_3_11z1zk1gc1auv.R.inc(80);for (int i = 0; (((i < x)&&(__CLR4_3_11z1zk1gc1auv.R.iget(81)!=0|true))||(__CLR4_3_11z1zk1gc1auv.R.iget(82)==0&false)); i++) {{
				__CLR4_3_11z1zk1gc1auv.R.inc(83);Random random = new Random();
				__CLR4_3_11z1zk1gc1auv.R.inc(84);String randomKey = keys.get( random.nextInt(keys.size()));
				__CLR4_3_11z1zk1gc1auv.R.inc(85);if((((fixKeys.contains(randomKey))&&(__CLR4_3_11z1zk1gc1auv.R.iget(86)!=0|true))||(__CLR4_3_11z1zk1gc1auv.R.iget(87)==0&false))) {{
					__CLR4_3_11z1zk1gc1auv.R.inc(88);i--;
				} }else {{
					__CLR4_3_11z1zk1gc1auv.R.inc(89);fixKeys.add(randomKey);
					__CLR4_3_11z1zk1gc1auv.R.inc(90);FinalMap.put(randomKey, full.get(randomKey));
				}
			}}
		}}finally{__CLR4_3_11z1zk1gc1auv.R.flushNeeded();}}
		
		public String getNextKey(String actualWord) {try{__CLR4_3_11z1zk1gc1auv.R.inc(91);
			__CLR4_3_11z1zk1gc1auv.R.inc(92);int index = fixKeys.indexOf(actualWord)+1;
			__CLR4_3_11z1zk1gc1auv.R.inc(93);String hello = (String) fixKeys.toArray()[index];

			__CLR4_3_11z1zk1gc1auv.R.inc(94);return hello;
		}finally{__CLR4_3_11z1zk1gc1auv.R.flushNeeded();}}
		
		public String getPreKey(String actualWord) {try{__CLR4_3_11z1zk1gc1auv.R.inc(95);
			__CLR4_3_11z1zk1gc1auv.R.inc(96);int index = fixKeys.indexOf(actualWord)-1;
			__CLR4_3_11z1zk1gc1auv.R.inc(97);String hello = (String) fixKeys.toArray()[index];
			
			__CLR4_3_11z1zk1gc1auv.R.inc(98);return hello;
		}finally{__CLR4_3_11z1zk1gc1auv.R.flushNeeded();}}
		
		public void setNextWord(String actualWord, Text key, Text value) {try{__CLR4_3_11z1zk1gc1auv.R.inc(99);
			__CLR4_3_11z1zk1gc1auv.R.inc(100);String nextHun = getNextKey(actualWord);
			__CLR4_3_11z1zk1gc1auv.R.inc(101);key.setText(nextHun);
			__CLR4_3_11z1zk1gc1auv.R.inc(102);value.setText(FinalMap.get(nextHun));
		}finally{__CLR4_3_11z1zk1gc1auv.R.flushNeeded();}}

		public void setPreWord(String actualWord,Text key,Text value) {try{__CLR4_3_11z1zk1gc1auv.R.inc(103);
			__CLR4_3_11z1zk1gc1auv.R.inc(104);String preHun = getPreKey(actualWord);
			__CLR4_3_11z1zk1gc1auv.R.inc(105);key.setText(preHun);
			__CLR4_3_11z1zk1gc1auv.R.inc(106);value.setText(FinalMap.get(preHun));
		}finally{__CLR4_3_11z1zk1gc1auv.R.flushNeeded();}}

		//10 kulcs-\ufffdrt\ufffdk p\ufffdrt t\ufffdrol
		public Map<String, String> getFinalMap() {try{__CLR4_3_11z1zk1gc1auv.R.inc(107);
			__CLR4_3_11z1zk1gc1auv.R.inc(108);return FinalMap;
		}finally{__CLR4_3_11z1zk1gc1auv.R.flushNeeded();}}
}
