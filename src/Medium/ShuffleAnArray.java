package Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ShuffleAnArray {

	public int[] shuffle (int [] arr){
			Random r = new Random();
		
		for ( int i = arr.length-1 ; i > 0 ; i--){
			int j = r.nextInt(i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for ( int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		return arr ;
	}
	
	public int[] reset(int [] arr){
		
		Arrays.sort(arr);
		System.out.println();
		for ( int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		return arr ;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6} ;
		ShuffleAnArray shuffled = new ShuffleAnArray();		
		shuffled.shuffle(arr);
		shuffled.reset(arr);
	}

}
