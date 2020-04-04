import java.util.HashSet;

public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
	
	 public static int singleNumber(int[] nums) {
		 HashSet<Integer> set = new HashSet<Integer>();
		 for(int i = 0; i < nums.length; i++) {
			 if(set.contains(nums[i])) {
				 set.remove(nums[i]);
			 }else {
				 set.add(nums[i]);
			 }
		 }
		 for(int i: set) {
			 return i;
		 }
	     return -1;
	 }

}
