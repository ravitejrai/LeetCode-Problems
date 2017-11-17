package String;

import java.util.Hashtable;

public class RomanToInteger {
	
	public static int rtoi(String num)
	{       
		String s = num.toLowerCase();
		Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
	    ht.put('i',1);
	    ht.put('x',10);
	    ht.put('c',100);
	    ht.put('m',1000);
	    ht.put('v',5);
	    ht.put('l',50);
	    ht.put('d',500);
	    
	    int intNum=0;
	    int prev = 0;
	    for(int i = s.length()-1; i>=0 ; i--)
	    {
	            int temp = ht.get(s.charAt(i));
	            if(temp < prev)
	                intNum-=temp;
	            else
	                intNum+=temp;
	            prev = temp;
	    }
	    return intNum;
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rtoi("DCXXI"));
	}
	

}
