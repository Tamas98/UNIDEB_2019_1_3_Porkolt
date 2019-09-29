/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controll.fileHandler;

import java.io.Reader;

public interface ReadFile extends FileHandler {

    Reader createReader();

    <T> T readFromJson(T readTo);

}
