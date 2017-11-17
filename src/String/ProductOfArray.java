package String;

public class ProductOfArray {
	
	public int[] productExceptSelf(int[] nums) {
	    int[] result = new int[nums.length];
	 
	    result[nums.length-1]=1;
	    for(int i=nums.length-2; i>=0; i--){
	        result[i]=result[i+1]*nums[i+1];
	    }
	 
	    int left=1;
	    for(int i=0; i<nums.length; i++){
	        result[i]=result[i]*left;
	        left = left*nums[i];
	    }
	    int k = 0;
	    while(k < result.length){
	    System.out.print(result[k] + " ");
	    k++ ;
	    }
	    
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,2,3,4};
		ProductOfArray product = new ProductOfArray();
		product.productExceptSelf(arr);
		
	}

}
