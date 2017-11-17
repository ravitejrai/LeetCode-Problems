package String;

import java.util.ArrayList;

public class IntersectionOfArrays {
	
	 int[] intersection(int[] arr1, int [] arr2)
	{
		ArrayList<Integer> hs = new ArrayList<>();
		ArrayList<Integer> hs1 = new ArrayList<>();
		int [] result = new int [arr2.length];
		int [] result1 = new int [arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		for (int j = 0; j < arr2.length; j++) {
			hs1.add(arr2[j]);
		}
		
		if (arr2.length < arr1.length){
		for (int i = 0; i < arr2.length; i++) {
			if (hs.contains(arr2[i]))
			result[i] = arr2[i] ;
			}
		}
		else{
			for (int i = 0; i < arr1.length; i++) {
				if (hs1.contains(arr1[i]))
				result1[i] = arr1[i] ;
				}
		}
		return arr1.length > arr2.length ? result : result1 ;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1,2} ;
		int [] nums2 = {1,1} ;
		IntersectionOfArrays inter = new IntersectionOfArrays() ;
		int [] x = inter.intersection(nums1,nums2);
		for (int k = 0 ; k < x.length ; k++)
			System.out.print(x[k] + " ");
		
	}	 
}
