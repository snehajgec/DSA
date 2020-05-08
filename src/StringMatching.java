import java.util.Scanner;

public class StringMatching {
	
	public static String stringShift(String s, int[][] shift) {
		int flag ,d;
		for(int[] row: shift) {
			//flag = shift[row][0];
		}
        return "";
    }
	
	public static String leftRotate(String s, int d) {
		return s.substring(d) + s.substring(0, d);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		int[][] shift = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				shift[i][j] = sc.nextInt();
			}
		}
		
		s = stringShift(s, shift);
		System.out.println(s);
	}
}
