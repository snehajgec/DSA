package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {
		int n = nums.length;
		if (n == 1) {
			return 1;
		} else {
			int lisArr[] = new int[n];
			Arrays.fill(lisArr, 1);
			for (int i = 1; i < n; i++) {
				for (int j = 0; j < i; j++) {
					if (nums[i] > nums[j]) {
						lisArr[i] = Math.max(lisArr[i], (lisArr[j] + 1));
					}
				}
			}
			int max = lisArr[0];
			for (int i = 0; i < n; i++) {
				max = Math.max(max, lisArr[i]);
			}

			return max;
		}

	}

	public static void main(String args[]) {
		int nums[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
		LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
		System.out.println(l.lengthOfLIS(nums));
	}
}
