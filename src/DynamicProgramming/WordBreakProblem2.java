package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakProblem2 {

	
	static List<String> outputAns = new ArrayList<String>();
	
	public static void main(String[] args) {

		List<String> dictionary = new ArrayList<String>();

		/*+
		 * String temp_dictionary[] = { "he", "hell", "hello", "I", "there", "the",
		 * "hope", "you", "are", "are", "having", "a", "nice", "day" };
		 */
		String temp_dictionary[] = { "cats","cat", "and", "sand", "dog"};

		
		for (String st : temp_dictionary) {
			dictionary.add(st);
		}

		//String word = "hellothereIhopeyouarehavinganiceday";
		String word = "catsanddog";

		wordBreak(word, dictionary);
//        System.out.println(wordBreak("catsandog", dictionary)); 

	}

	public static List<String> wordBreak(String s, List<String> wordDict) {
		String out = "";
		List<String> ans = new ArrayList<>();
		Map<String, String> optAns = new HashMap();
		wordBreakPrint(s, wordDict, out, ans, optAns);
		return ans;
	}

	public static String wordBreakPrint(String s, List<String> wordDict, String out, List<String> ans, Map<String, String> optAns) {		
		if (s.length() == 0) {
			ans.add(out);
			System.out.println("/" + out);
			return out;
		}
		String ansO = "";
		for (int i = 1; i <= s.length(); i++) {
			String prefix = s.substring(0, i);
			if (wordDict.contains(s.substring(0, i))) {
				String output;
				if(out.equals("")) {
					output = out + prefix;
				}
				else {
					output = out + " " + prefix;
				}
				outputAns.add(output);
				ansO = wordBreakPrint(s.substring(i, s.length()), wordDict, output, ans, optAns);
				

			}
		}
		System.out.println("* " + ansO);
		return ansO;
	}

}
