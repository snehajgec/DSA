package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class WordBreakProblem2 {

	public static void main(String[] args) {

		List<String> dictionary = new ArrayList<String>();

		String temp_dictionary[] = { "he", "hell", "hello", "I", "there", "the", "hope", "you", "are", "are", "having",
				"a", "nice", "day" };

		for (String st : temp_dictionary) {
			dictionary.add(st);
		}

		String word = "hellothereIhopeyouarehavinganiceday";

		wordBreak(word, dictionary);
//        System.out.println(wordBreak("catsandog", dictionary)); 

	}

	public static void wordBreak(String s, List<String> wordDict) {
		String out = "";
		wordBreakPrint(s, wordDict, out);
	}

	public static void wordBreakPrint(String s, List<String> wordDict, String out) {
		if (s.length() == 0) {
			System.out.println(out);
			return;
		}
		for (int i = 1; i <= s.length(); i++) {
			String prefix = s.substring(0, i);
			if (wordDict.contains(s.substring(0, i))) {
				wordBreakPrint(s.substring(i, s.length()), wordDict, out + " " + prefix);

			}
		}
	}

}
