import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter array:");
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("Enter sum:");
		int sum = sc.nextInt();
		System.out.println("Two sum:");
		twoSum(n, arr, sum);
	}
	
	public static void twoSum(int n, int[] arr, int sum){
	    Map<Integer, Integer> hm = new HashMap<>();
	    int temp;
	    for(int i = 0; i < n; i++){
	        temp = sum - arr[i];
	        if(hm.containsKey(temp)){
	            System.out.println(hm.get(temp) + "," + i);
	        }else{
	            hm.put(arr[i], i);    
	        }
	    }
	    
	}
}
