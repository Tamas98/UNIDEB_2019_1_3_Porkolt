/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controll.fileHandler;

import java.io.Writer;

public interface WriteFile extends FileHandler {

    <T> void writeToJson(T toWrite);

    Writer createWriter();

}
