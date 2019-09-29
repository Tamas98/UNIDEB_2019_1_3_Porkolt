package Controll.Learning;

import javafx.scene.text.Text;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class LearningMethod implements Learn {

		public static List<String> fixKeys = new ArrayList<String>();

		public static Map<String,String> FinalMap = new HashMap<>();
		
		public Map<String,String> readFullMap() {
			return null;
		}

		public void get10Random(Map<String,String> full) {

			List<String> keys = new ArrayList<String>(full.keySet());
			int x = 10;
			
			if(full.size() <= 10) {
				x = full.size();
			}
			
			for (int i = 0; i < x; i++) {
				Random random = new Random();
				String randomKey = keys.get( random.nextInt(keys.size()));
				if(fixKeys.contains(randomKey)) {
					i--;
				} else {
					fixKeys.add(randomKey);
					FinalMap.put(randomKey, full.get(randomKey));
				}
			}
		}
		
		public String getNextKey(String actualWord) {
			/*String next = null;
			
			next = fixKeys.get(fixKeys.indexOf(actualWord) + 1);*/
			int index = fixKeys.indexOf(actualWord)+1;
			System.out.println(index);
			System.out.println(fixKeys.size());
			String hello = (String) fixKeys.toArray()[index];

			return hello;
		}
		
		public String getPreKey(String actualWord) {
			/*String pre = null;
			
			pre = fixKeys.get(fixKeys.indexOf(actualWord) - 1);*/

			int index = fixKeys.indexOf(actualWord)-1;
			System.out.println(index);
			System.out.println(fixKeys.size());
			String hello = (String) fixKeys.toArray()[index];
			
			return hello;
		}
		
		public void setNextWord(String actualWord, Text key,Text value) {
			String nextHun = getNextKey(actualWord);
			System.out.println(nextHun);
			key.setText(nextHun);
			value.setText(FinalMap.get(nextHun));
		}

		public void setPreWord(String actualWord,Text key,Text value) {
			String preHun = getPreKey(actualWord);
			System.out.println(preHun);
			key.setText(preHun);
			value.setText(FinalMap.get(preHun));
		}

		//10 kulcs-�rt�k p�rt t�rol
		public Map<String, String> getFinalMap() {
			return FinalMap;
		}
}
