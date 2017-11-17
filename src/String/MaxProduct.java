package String;

import java.util.Arrays;

public class MaxProduct {
	

	
	static void checkmax(int [] arr){
		
		int first , second , third , min1 , min2;
		first = second = third = Integer.MIN_VALUE ;
		min1 = min2 = Integer.MAX_VALUE ;
		
		for (int i = 0; i < arr.length ; i++)
        {
            if (arr[i] > first)
            {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second)
            {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third)
                third = arr[i];
            
            else if (arr[i] > min1){
            	min2 = min1 ;
            	min1 = arr[i];
            }
            else if (arr[i] > min2)
            	min2 = arr[i] ;
            
        }
		System.out.println(first + " " + second + " " + third + " " + min1 + " " + min2 );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {-10,-11,8,9,0,1,2,4,6} ;
        /*Arrays.sort(num);
		for ( int i = 0 ; i < num.length ; i++){
			System.out.print(num[i] + " ") ;
		}*/
		checkmax(num);
	}

}
