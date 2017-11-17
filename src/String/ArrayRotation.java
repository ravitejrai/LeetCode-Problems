package String;

public class ArrayRotation {
	
	static int [] rightrotation(int [] nums , int k){
		
		int [] temp_array = new int[nums.length];
        int i = 0 ;
        int j = 0 ;
        k = k % nums.length ;
        while(i < nums.length){
            while (k < nums.length){
                temp_array[i++] = nums[k++];
            }
            temp_array[i++] = nums[j++] ;
        }
        for (int p = 0; p < nums.length; p++) {
            nums[p] = temp_array[p];
        }
        return nums ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] nums = {1,2,3,4,5,6,7};
			int k = 3;
			int [] x = rightrotation(nums,k);
			for ( int i = 0 ; i < x.length ; i++){
				System.out.print(x[i] + " ");
			}
	}

}
