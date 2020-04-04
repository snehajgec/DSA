import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 19;
		System.out.println("ans - " + isHappyNumber(n).toString());
	}
	
	public static Boolean isHappyNumber(int n) {
		HashSet<Integer> seen = new HashSet<>();
		while(n != 1) {
			int current = n;
			int sum = 0;
			while( current != 0) {
				sum += (current%10) * (current%10);
				current /= 10;
			}
			
			if(seen.contains(sum)) {
				return false;
			}
			
			seen.add(sum);
			n = sum;
		}
		return true;
	}
}
