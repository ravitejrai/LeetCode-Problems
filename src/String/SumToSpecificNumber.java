package String;

import java.util.ArrayList;

public class SumToSpecificNumber {
	
	 public int[] twoSum(int[] nums, int target) {
		
	       for ( int i = 0 ; i < nums.length ; i++){
				for ( int j = i + 1 ; j < nums.length ; j++){
					if (nums[i] + nums[j] == target){
						System.out.println(i + " " + j);
						return new int[] { i, j };
					}
				}
			}
	       throw new IllegalArgumentException("No two sum solution");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,2,4} ;
		int target = 6 ;
		SumToSpecificNumber sc = new SumToSpecificNumber() ;
		
		System.out.println(sc.twoSum(nums, target));
	}

}
