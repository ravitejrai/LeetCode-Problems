package String;

public class BuyAndSellStock {
	
	static void buyandSellone(int [] stock){
		int diff = 0 ;
		for (int i = 0 ; i < stock.length -1 ; i++){
			if (stock[i+1] > stock[i]) {
				diff = diff + (stock[i+1] - stock[i]) ;
			}
		}
		System.out.println(diff);
	}
	
	static void buyandSelltwo(int [] prices){
		
		 int minprice = Integer.MAX_VALUE;
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length; i++) {
	            if (prices[i] < minprice)
	                minprice = prices[i];
	            else if (prices[i] - minprice > maxprofit)
	                maxprofit = prices[i] - minprice;
	        }
	        System.out.println(maxprofit);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] stock = {7,1,5,3,6,4};
		buyandSellone(stock);
		buyandSelltwo(stock);
	}

}
