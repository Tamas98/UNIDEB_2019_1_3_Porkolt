package Controller;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class LearningMethod implements Learning {
		
		private List<String> fixKeys = new ArrayList<String>();
		private Map<String,String> FinalMap = new HashMap<>();
		
		public Map<String,String> readFullMap() {
			return null;
		}

		public void get10Random(Map<String,String> full) {
			
			int x = 2;
			
			if(full.size() <= 2) {
				x = full.size();
			}
			
			for (int i = 0; i < x; i++) {
				Random random = new Random();
				List<String> keys = new ArrayList<String>(full.keySet());
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
			String next = null;
			
			next = fixKeys.get(fixKeys.indexOf(actualWord) + 1);
			
			return next;
		}
		
		public String getPreKey(String actualWord) {
			String pre = null;
			
			pre = fixKeys.get(fixKeys.indexOf(actualWord) - 1);
			
			return pre;
		}
		
		public void setNextWord(String actualWord) {
			String nextHun = getNextKey(actualWord);;
			String nextOther = FinalMap.get(nextHun);
		}
		
		public void setPreWord(String actualWord) {
			String preHun = getNextKey(actualWord);;
			String preOther = FinalMap.get(preHun);
		}
		
		//10 kulcs-érték párt tárol
		public Map<String, String> getFinalMap() {
			return FinalMap;
		}
}
