package String;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingNumber {
	
	  public ArrayList<Integer> missingNumber(int[] nums) {
	        HashSet<Integer> hs = new HashSet<Integer>();
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        int i = 0 ;
	        for (i = 0 ; i < nums.length  ; i++){
	        	hs.add(nums[i]) ;
	        }
	        System.out.println(hs);
	        for (int j = 0 ; j < nums.length ; j++){
	        if ( hs.contains(j+1))
	        	continue ; 
	        else
	        	al.add(j+1);
	        }
	        return al ;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,1,2,2,3,4,7,8} ;
		MissingNumber MN = new MissingNumber() ;
		System.out.println(MN.missingNumber(nums));
	}

}
