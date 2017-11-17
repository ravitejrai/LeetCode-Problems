package String;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {0,1,0,2,3} ;
		int temp = 0 ;
		for (int j = 0 ; j < nums.length -1 ; j++ ){
		for (int i = 0 ; i < nums.length -1 ; i++ ){
			if (nums[i] == 0) {
				temp = nums[i+1] ;
				nums[i+1] = nums[i] ;
				nums[i] = temp ;
			}
		}
		}
		for (int i = 0 ; i < nums.length ; i++ ){
		System.out.print(nums[i] + " ");
		}
	}

}
