package BinaryTree;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int numberOfDays = in.nextInt();
		List<String> arr = new ArrayList<String>();
		for (int i = 0; i < numberOfDays; i++) {
			String ingredient = in.next();
			arr.add(ingredient);
		}
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("FAT", 0);
		hm.put("FIBER", 0);
		hm.put("CARB", 0);
		int val = 0;
		//System.out.println(ingredient);
		//String arr[] = ingredient.split("\\s+");
		boolean flag = false;
		int count = 0;
		int count1 = 0;
		int days[] = new int[arr.size()];
		int fatVal = 0;
		int fiberVal = 0;
		int carbVal = 0;
		for (String s : arr) {
			if (s.indexOf("FAT") != -1) {
				//System.out.println("Incrementing fatval");
				fatVal = hm.get("FAT");
				fatVal++;
				//System.out.println("Incrementing fatval" + fatVal);
				hm.put("FAT", fatVal);
			} 
			if (s.indexOf("FIBER") != -1) {
				//System.out.println("Incrementing fiberVal");
				fiberVal = hm.get("FIBER");
				fiberVal++;
				//System.out.println("Incrementing fiber" + fiberVal);
				hm.put("FIBER", fiberVal);
			} 
			if (s.indexOf("CARB") != -1) {
				//System.out.println("Incrementing carbVal");
				carbVal = hm.get("CARB");
				carbVal++;
				//System.out.println("Incrementing carb" + carbVal);
				hm.put("CARB", carbVal);
			}
			count++;
			count1++;
			flag = false;
			//System.out.println("Count = " + count);
			if (count >= 3) {
				//count1 = count;
				if (fatVal >= 2) {
					flag = true;
					//System.out.println("FatVal before = " + fatVal);
					if(fatVal > 2) {
						fatVal = fatVal - 3;
					}else {
						if(fiberVal > 0) {
							fiberVal--;
						}
						else if(carbVal > 0) {
							carbVal--;
						}
						fatVal = fatVal - 2;
					}
					//fatVal = fatVal - 2;
					//System.out.println("FatVal after = " + fatVal);
				}
				if (fiberVal >= 2) {
					flag = true;
					//System.out.println("fiberVal before = " + fiberVal);
					if(fiberVal > 2) {
						fiberVal = fiberVal - 3;
					}else {
						if(fatVal > 0) {
							fatVal--;
						}
						else if(carbVal > 0) {
							carbVal--;
						}
						fiberVal = fiberVal - 2;
					}
					//fiberVal = fiberVal - 2;
					//System.out.println("fiberVal after = " + fiberVal);
				}
				if (carbVal >= 2) {
					flag = true;
					//System.out.println("carbVal before = " + carbVal);
					if(carbVal > 2) {
						carbVal = carbVal - 3;
					}else {
						if(fatVal > 0) {
							fatVal--;
						}
						else if(carbVal > 0) {
							carbVal--;
						}
						carbVal = carbVal - 2;
					}
					//carbVal = carbVal - 2;
					//System.out.println("carbVal after = " + carbVal);
				}
				
				if(flag == true && count1>=3) {
					days[count-1] = 1;
					count1 = count1 - 3;
				}
			}
			
			if(flag == false) {
				days[count-1] = 0;
			}

		}
		//System.out.println("Output");
		//System.out.println("Length" + days.length);
		for(int i : days) {
			System.out.print(i);
		}
	}
}

//FATOil FIBERSpinach CARBRice FATCheese FIBERBeans
