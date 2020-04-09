

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> output = new ArrayList<List<String>>();
		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
		
		for(String s : strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);
			if(!hm.containsKey(sorted)) {
				hm.put(sorted, new ArrayList<String>());
			}
			hm.get(sorted).add(s);
			
		}
		
		hm.keySet().forEach(temp->{
			output.add(hm.get(temp));
		});
		
		return output;
	}

	public static void main(String[] args) {
		String wordArr[] = { "cat", "dog", "tac", "god", "act" }; 
        int size = wordArr.length; 
        groupAnagrams(wordArr);
	}

}
