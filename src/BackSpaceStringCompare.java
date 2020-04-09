import java.util.ArrayDeque;
import java.util.Deque;

public class BackSpaceStringCompare {
	
	public static boolean backspaceCompare(String S, String T) {
		if(removeSpace(S).equals(removeSpace(T))) {
			return true;
		}else {
			return false;
		}
    }

	private static String removeSpace(String S) {
		Deque<Character> q = new ArrayDeque<Character>();
		
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) != '#') {
				q.addLast(S.charAt(i));
			}else {
				if(!q.isEmpty())
					q.removeLast();
			}
		}
		
		String ans = q.toString();
		System.out.println(ans);
		return ans;
	}
	
	public static void main(String args[]) {
		String s = "a#c";
		String t = "b";
		Boolean value = backspaceCompare(s,t);
	}
	

}
