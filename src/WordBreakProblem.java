import java.util.*;

public class WordBreakProblem {

	public static void main(String[] args) {
		
		List<String> dictionary = new ArrayList<String>();
		
        String temp_dictionary[] = {"cats", "dog", "sand", "and", "cat"}; 
        
        for(String st: temp_dictionary){
            dictionary.add(st);
        }                      
                              
        System.out.println(wordBreak("catsanddog", dictionary)); 
        System.out.println(wordBreak("catsandog", dictionary)); 

	}
	public static boolean wordBreak(String s, List<String> wordDict) {
        if(s.equals("")){
            return true;
        }
        for(int i = 1; i <= s.length(); i++){
            if(wordDict.contains(s.substring(0,i)) && wordBreak(s.substring(i, s.length()),wordDict)){
                return true;
            }
        }
        return false;
    }
}
