package String;

public class MaxContiguousSubArray {
	
	static int sofar( int [] prices){
	 int Max_Till_End = 0 ;
	 int Max_Till_Now = 0 ;
	 
	 for ( int i = 0 ; i < prices.length ; i++){
		 Max_Till_Now = Max_Till_Now + prices[i] ;
		 if(Max_Till_Now < 0)
	            Max_Till_Now = prices[i] ;
		 if(Max_Till_End < Max_Till_Now)
	            Max_Till_End = Max_Till_Now ;
	 }
	 return Max_Till_End ;
	}
	
	public int DP( int [] prices){
		int [] sol = new int [prices.length + 1] ;
		
		sol[0] =  0 ;
		
		for ( int j = 1 ; j < sol.length ; j++){
			sol[j] = Math.max(sol[j-1] + prices[j-1], prices[j]) ;
		}
		
		return sol[sol.length -1] ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {-2,1,-1} ;
		//contiguous subarray [4,-1,2,1] has the largest sum = 6. 
		System.out.println(sofar(prices));
		MaxContiguousSubArray MC = new MaxContiguousSubArray() ;
		System.out.println(MC.DP(prices));
		
	}

}
