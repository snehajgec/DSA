package leetcodeeasy;

public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
		
		int n = nums.length;
		if( n == 0 || n == 1) {
			return n;
		}
		
		int j = 0;
		
		for(int i = 0; i< (n - 1); i++) {
			if(nums[i] != nums[i+1]) {
				nums[j++] = nums[i];
			}
		}
		
		nums[j++] = nums[n-1];
        return j;
    }
	
	public static void main(String[] args) {
		int nums[] = { 1,1,2 };
		removeDuplicates(nums);
	}
}
