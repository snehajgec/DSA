
public class MoveZeroes {

	public static void main(String[] args) {
		int nums[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		moveZeroes(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	public static void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != 0) {
        		nums[count++] = nums[i];
        	}
        }
        while(count < nums.length) {
        	nums[count++] = 0;
        }
    }

}
