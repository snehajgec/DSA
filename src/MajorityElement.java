import java.util.HashMap;

public class MajorityElement {

	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int element = 0;
		if (nums.length == 1) {
			element = nums[0];
		}
		else {
			for (Integer i : nums) {
				int count = 0;
				if (hm.containsKey(i)) {
					count = hm.get(i);
					count++;
					hm.put(i, count);

					if (count > (nums.length) / 2) {
						element = i;
					}
				} else {
					count++;
					hm.put(i, count);
				}
			}
		}
		return element;

	}

	public static void main(String[] args) {
		MajorityElement m = new MajorityElement();
		int[] nums = { 3, 2, 3 };
		System.out.println(m.majorityElement(nums));

	}
}
