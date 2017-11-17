package String;

import java.util.HashMap;

public class MajorityElement {
	
	public static void findmajority(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                    int count = map.get(arr[i]) +1;
                    if (count > arr.length /2) {
                        System.out.println("Majority found :- " + arr[i]);
                        return;
                    } else
                        map.put(arr[i], count);
 
            }
            else
                map.put(arr[i],1);
            }
            System.out.println(" No Majority element");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,1,1,1,2,2,3} ;
		findmajority(arr) ;
	}

}
