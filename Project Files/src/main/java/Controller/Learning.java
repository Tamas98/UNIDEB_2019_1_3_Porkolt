package Controller;
import java.util.Map;

public interface Learning {
	
	Map<String,String> readFullMap();
	
	void get10Random(Map<String,String> full);
	
	Map<String, String> getFinalMap();
	
	String getNextKey(String actualWord);
	
	String getPreKey(String actualWord);
	
	void setNextWord(String actualWord);
	
	void setPreWord(String actualWord);
}
