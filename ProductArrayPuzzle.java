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
		productArray(n, arr);
	}
	
	public static void productArray(int n, int[] arr){
	    int left[] = new int[n];
	    int right[] = new int[n];
	    int temp = 1, i;
	    left[0] = 1;
	    right[n-1] = 1;
	    
	    for(i = 1; i < n; i++){
	        left[i] = left[i - 1] * arr[i - 1] ;
	    }
	    
	    for(i = n - 2; i >= 0; i--){
	        right[i] = right[i + 1] * arr[i + 1] ;
	    }
	    
	    for(i = 0; i < n; i++){
	        arr[i] = left[i] * right[i];
	    }
	    
	    for(i = 0; i < n; i++){
	        System.out.print(arr[i] + ",");
	    }
	}
}
