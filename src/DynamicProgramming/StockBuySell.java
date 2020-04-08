package DynamicProgramming;

import java.util.ArrayList;

public class StockBuySell {
	
	public static int maxProfit(int[] price) {
		
		ArrayList<Stock> obj = new ArrayList<Stock>();
		
		int  i = 0, n,count = 0, profit = 0;
		n = price.length;
		
		while(i < (n - 1)) {
			
			System.out.println("incrementing for local minima i :" );
			while(i<(n - 1) && price[i] >= price[i + 1]) {
				System.out.print(i + " ");
				i++;
			}
			if(i == n) {
				return 0;
			}
			
			Stock st = new Stock();
			System.out.println("Setting local minima in buy :" + i );
			st.buy = i++;
			
			System.out.println("incrementing for local maxima i :" );
			while(i< n && price[i] >= price[i - 1]) {
				i++;
				System.out.print(i + " ");
			}
			st.sell = i - 1;
			obj.add(st);
			
			count++;
			
		}
		  
		if(count == 0) {
			System.out.println(0);
		}else {
			for(Stock st : obj) {
				System.out.println("SP : "  + price[st.sell]  + " CP: " +  price[st.buy]);
				profit = profit  + (price[st.sell] - price[st.buy]);
			}
			System.out.println("total :" + profit);
		}
		
		return 0;
	}
	
	public static void main(String[] args) {

		int price[] = { 7,1,5,3,6,4 }; 
		maxProfit(price);
		
	}
	
}
class Stock{
	int buy;
	int sell;
}
