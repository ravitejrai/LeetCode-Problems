package String;

import java.util.ArrayList;

public class ReverseStringByWord {
	
		public String reverseWords(String str) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
		String y = sb.append(str).reverse().toString();
		String[] t = y.split("\\s") ;
		int start = 0 ;
		int end = t.length -1 ;
		while ( start < end){
			String temp = t[start];
			t[start] = t[end];
			t[end] = temp;
			start++;
			end--;
		}
		for (int i = 0 ; i < t.length ; i++){
			sb1.append(t[i]+ " ") ;
		}
		System.out.println(sb1);
		return sb1.toString().trim();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Let's take LeetCode contest";
		//Output  "mar si a doog yob"
		ReverseStringByWord rv = new ReverseStringByWord();
		rv.reverseWords(str);
		
	}

}
