package DynamicProgramming;

import java.util.*;
import java.math.*;

public class MaximumSubArray {

	public static int maxSubArray(int[] nums) {

		int ans = nums[0];
		
		// If all are negative numbers, then the max subarray will be number having maximum value
		for(int i = 0; i < nums.length; i++) {
			ans = Math.max(nums[i], ans);
		}
		if(ans < 0) {
			return ans;
		}
		
		//In rest of the case, if there is any case, when adding the numbers gives negative value,
		//then the sum is reset to 0, it is then compared with the previous added sum.
		//Now again, then next numbers are added to get the positive sum value
		ans = 0;
		int sum = 0;
		for(int i = 0; i< nums.length; i++) {
			if(sum + nums[i] > 0) {
				sum = sum + nums[i];
			}else {
				sum = 0;
			}
			ans = Math.max(sum,ans);
		}
		return ans;
	}

	public static void main(String[] args) {
		
        int[] nums = { 1, -3, 5, -7 };
        
        System.out.println("The sum of contiguous sub-array with the " +
                            "largest sum is " + maxSubArray(nums));

	}

}
