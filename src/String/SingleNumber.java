package String;

import java.util.ArrayList;

//Given an array of integers, every element appears twice except for one. Find that single one.

//Note:
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 

/*Given an array of integers, every element appears twice except for one. 
Find that single one. We can use XOR operation. 
Because every number XOR itself, the results will be zero. 
So We XOR every integer in the array, and the result is the single one we want to find.
Here is the java version code:*/

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {2,1,2,5,5,1,7};
		int res=0;
        for(int i=0;i<A.length;i++){
            res=res^A[i];
            System.out.println(res);
        }
        System.out.println(res);;

	}

}


/*Follow up 1: Given an array of integers, every element appears three times except for one. Find that single one. 
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
For this problem, we can't use the XOR operation.The best way to solve this problem is use "bit count". 
Create a 32 length int array count[32]. count[i] means how many '1' in the ith bit of all the integers. 
If count[i] could be divided by 3, then we ignore this bit, else we take out this bit and form the result.
Below is java version code:*/

/*public class Solution {
    public int singleNumber(int[] A) {
        int res=0;
        int[] count=new int[32];
        for(int i=0;i<32;i++){
            for(int j=0;j<A.length;j++){
                if(((A[j]>>i)&1)==1){
                    count[i]=count[i]+1;
                }
            }
            if((count[i]%3)!=0){
                res=res|(1<<i);
            }
        }
        return res;
    }
}*/
