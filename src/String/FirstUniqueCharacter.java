package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


/*public class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}*/

public class FirstUniqueCharacter {

	static String str = "loveleetcode" ;
	static char [] arr = str.toCharArray();

	public static char key (LinkedHashMap<Character,Integer> map){
		char keyvalue = 0 ;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()==1) {
				keyvalue = entry.getKey();
				System.out.println(keyvalue);
				return keyvalue ;
			}
		}
		return keyvalue ;
	}

	public static void print (char x){
		for(int i = 0; i < arr.length ; i++) {
			if (arr[i] == x){
				System.out.println(i);
			}

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i < arr.length ; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i],  map.get(arr[i]) +1);
			} else
				map.put(arr[i], 1);
		}
		System.out.println(map);	
		key(map);
		//print(x);
	}
}

