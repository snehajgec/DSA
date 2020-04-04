package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;

public class WordBreakProblem2 {

	public static void main(String[] args) {

		List<String> dictionary = new ArrayList<String>();

		/*
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
		wordBreakPrint(s, wordDict, out, ans);
		return ans;
	}

	public static void wordBreakPrint(String s, List<String> wordDict, String out, List<String> ans) {
		if (s.length() == 0) {
			ans.add(out);
			System.out.println(out);
			return;
		}
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
				wordBreakPrint(s.substring(i, s.length()), wordDict, output, ans);

			}
		}
	}

}
