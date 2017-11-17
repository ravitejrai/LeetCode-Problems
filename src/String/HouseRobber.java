package String;

public class HouseRobber {
	
	public int rob (int[] nums){
		if (nums == null || nums.length == 0){
			return 0 ;
		}
		if ( nums.length == 1){
			return nums[0] ;
		}
		
		int [] dp = new int[nums.length] ;
		dp[0] = nums[0] ;
		dp[1] = Math.max(nums[0], nums[1]) ;
		
		for ( int i = 2 ; i < nums.length ; i++){
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
		
		return dp[nums.length-1] ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,4,5,6} ;
		HouseRobber hubby = new HouseRobber() ;
		System.out.println(hubby.rob(nums));
	}

}