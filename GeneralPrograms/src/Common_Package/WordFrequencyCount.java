package Common_Package;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCount {

	public static void main(String[] args) {
		
		
		String str = "Test Automation Test Test Automation Kishore Automation";
		Map<String,Integer> hmap = new HashMap<String,Integer>();
		
		
		for(String word:str.split(" ")) {
			
			if(hmap.containsKey(word))
				hmap.put(word, hmap.get(word)+1);
			else
				hmap.put(word,1);
			
			
		}
		
		System.out.println(hmap);
		
	}

}
