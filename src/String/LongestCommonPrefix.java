package String;

import java.util.Arrays;

public class LongestCommonPrefix {
	
/*	static void lcs (String[] str){
		int i = 0 ;
		int min = Integer.MAX_VALUE ;
		int minindex = -1 ;
		while ( i < str.length){
			if (min < str[i].length())
				i++;
			else
				min = str[i].length() ;
				minindex = i ;
				i++ ;
		}
		StringBuilder sb = new StringBuilder();
		for (int j = 0 ; j < min ; j++){
			int k = 0 ;
			while ( k < str.length){
			if (str[minindex].charAt(j) == str[k].charAt(j))
				k++ ;
			else{
				break;
			}
		
		}
			if(k==str.length)
			sb.append(str[minindex].charAt(j));	
		}
		System.out.println(sb);
	}*/
	
	static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        if (strs!= null && strs.length > 0){
        
            Arrays.sort(strs);
            
            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();
            
            for (int i = 0; i < a.length; i++){
                if (b.length > i && b[i] == a[i]){
                    result.append(b[i]);
                }
                else {
                    return result.toString();
                }
            }
    }
        return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String [] test = {"gz" , "geeks" , "geek" , "gfefgd"} ;
		//lcs(test);
		System.out.println(lcp.longestCommonPrefix(test));
	}

}
