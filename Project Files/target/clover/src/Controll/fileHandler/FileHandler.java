/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controll.fileHandler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public interface FileHandler {public static class __CLR4_3_13131k1gc1av1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0066\u006f\u006d\u0069\u002f\u0053\u0075\u006c\u0069\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0055\u004e\u0049\u0044\u0045\u0042\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0033\u005f\u0050\u006f\u0072\u006b\u006f\u006c\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0020\u0046\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1570447739092L,8589935092L,122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Logger log = LoggerFactory.getLogger(FileHandler.class);

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    default void closeReader(Reader reader){try{__CLR4_3_13131k1gc1av1.R.inc(109);
        __CLR4_3_13131k1gc1av1.R.inc(110);try {
            __CLR4_3_13131k1gc1av1.R.inc(111);reader.close();
            __CLR4_3_13131k1gc1av1.R.inc(112);log.info("Reader successfully closed");
        } catch (IOException e) {
            __CLR4_3_13131k1gc1av1.R.inc(113);e.printStackTrace();
            __CLR4_3_13131k1gc1av1.R.inc(114);log.error("Error while closing the reader");
        }
    }finally{__CLR4_3_13131k1gc1av1.R.flushNeeded();}}

    default void closeWriter(Writer writer){try{__CLR4_3_13131k1gc1av1.R.inc(115);
        __CLR4_3_13131k1gc1av1.R.inc(116);try {
            __CLR4_3_13131k1gc1av1.R.inc(117);writer.flush();
            __CLR4_3_13131k1gc1av1.R.inc(118);writer.close();
            __CLR4_3_13131k1gc1av1.R.inc(119);log.info("Writer successfully closed");
        } catch (IOException e) {
            __CLR4_3_13131k1gc1av1.R.inc(120);e.printStackTrace();
            __CLR4_3_13131k1gc1av1.R.inc(121);log.error("Error while closing the writer");
        }
    }finally{__CLR4_3_13131k1gc1av1.R.flushNeeded();}}
}
