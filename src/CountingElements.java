import java.util.HashMap;
import java.util.HashSet;

public class CountingElements {
	
	 public static int countElements(int[] arr) {
		int totalCount = 0; 
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(!hm.containsKey(arr[i])){
				hm.put(arr[i], 1);
			}else {
				int count = hm.get(arr[i]);
				count++;
				hm.put(arr[i], count);
			}
		}
		
		for(Integer temp : hm.keySet()) {
			if(hm.containsKey(temp + 1)) {
				totalCount  = totalCount + hm.get(temp);
			}
		}
		
		System.out.println("Count = " + totalCount);
		return totalCount;
	 }
	
	public static void main(String[] args) {
		int input[] = { 1,3,2,3,5,0 }; 
		countElements(input);
	}
}
