package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDisappearedinanArray {
	
	static List<Integer> findnumbers(int [] arr){
		//int [] newarray = new int [arr.length];
		ArrayList<Integer> newarray = new ArrayList<Integer>();
		Arrays.sort(arr);
		for ( int j = 0 ; j < arr.length -1 ; j++){
			if (arr[0] != arr[1] ){
			if ( arr[j] == arr[j+1] || (arr[j+1]-arr[j]) == 1)
				continue;
			else{
				int length = arr[j+1] - arr[j] ;
				for ( int p = 1 ; p < length ; p++){
					newarray.add(arr[j] + p) ;	
				}
			}
			}
			else
				newarray.add(arr[0]+1);
		}
		System.out.println(newarray);
		return newarray ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,1};
		findnumbers(arr);
	}

}
