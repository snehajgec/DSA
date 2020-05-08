package CodeChefMayLong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public List<Integer> findInfected(int n, int[] arr) {
		int infectPerson = arr[0];
		int best = n, worst = 1, temp = 1;
		int i = 0;
		if(n == 1) {
			return Arrays.asList(1,1);
		}
		while (i < n) {
			while ((i + 1) < n && (arr[i + 1] - arr[i]) > 2) {
				i++;
			}
			if(i == n) {
				infectPerson = arr[n-1];
			}else {
				infectPerson = arr[i];
			}
			//System.out.println("Found first infected person :" + infectPerson);
			int count = 0;
			while (i < n && (arr[i] - infectPerson) <= 2) {
				count++;
				infectPerson = arr[i];
				//System.out.println("Found next infected person :" + arr[i]);
				i++;
			}
			if (count > worst) {
				worst = count;
				temp = count;
			}

			if (temp < best) {
				best = temp;
			}
		}

		return Arrays.asList(best,worst);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();		
		Solution s = new Solution();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			List<Integer> count = s.findInfected(n, arr);
			result.add(count);
		}
		int k = 0;
		for(List<Integer> list: result) {
			System.out.print(list.get(0) + " " + list.get(1));
			System.out.println();
		}
	}
}
