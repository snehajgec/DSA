import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayRearrangment {

  public static String getOutput(int[] a, int[] b, int x, int n) {
    List<Integer> list = new ArrayList<>();
    int flag = 0;
    for(int i = 0; i < n; i++) {
      list.add(b[i]);
    }

    for(int i = 0; i < n; i++) {
      int rem = x  - a[i];
      if(rem <= 0 && list.contains(rem) || (b[n - (i + 1)] + a[i]) > x) {
        flag = 1;
        break;
      }
    }
    return flag == 1 ? "no" : "yes";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int n, x;
    String str[] = new String[t];
    for(int i = 0; i < t; i++) {
      n = sc.nextInt();
      x = sc.nextInt();

      int a[] = new int[n];
      int b[] = new int[n];

      for(int j = 0; j < n; j++) {
        a[j] = sc.nextInt();
      }

      for(int j = 0; j < n; j++) {
        b[j] = sc.nextInt();
      }

      str[i] = getOutput(a, b, x, n);
    }

    for(String s : str){
      System.out.println(s);
    }
  }
}
