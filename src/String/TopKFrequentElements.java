package String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
	
	void MostFrequentKItems(int [] arr , int k ){
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		int count = 1 ;
		for ( int i = 0 ; i < arr.length ; i++){
		if (hs.containsKey(arr[i])){
			hs.put(arr[i], ++count);
		}
		else{
			count = 1 ;
			hs.put(arr[i], count);
		}
		}
		List<Integer> l = new ArrayList<Integer>(hs.values());
		Collections.sort(l);
		l = l.subList(l.size() -k ,l.size());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arr = {1,1,1,2,2,2,2,3,3,4,5};
			TopKFrequentElements freq = new TopKFrequentElements();
			int k = 2 ;
			freq.MostFrequentKItems(arr,k);
	}

}
