package String;

import java.util.ArrayList;

public class containsDuplicateArrayOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,4,3,2,4} ;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0 ; i < arr.length ; i++){
			if (al.contains(arr[i])){
				System.out.println("Duplicate exists");
			}
			else {
				al.add(arr[i]);
			}
		}
	}
}
