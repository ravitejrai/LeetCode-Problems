package String;

import java.util.Stack;

public class ValidParentheses {
	
	boolean isValid(String s){
		
		Stack<Character> st = new Stack<Character>();
		if ( s.length() < 2){
			return false ;
		}
		for ( int i = 0 ; i < s.length() -1 ; i++){
			 if(s.charAt(i) == '(' && s.charAt(i+1) == ')'|| s.charAt(i) == '['  && s.charAt(i+1) == ']'||    s.charAt(i) == '{'  && s.charAt(i+1) == '}')
	               return true ;
	            else
	                st.push(s.charAt(i));
		}
		return st.isEmpty() ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "([{}])" ;
		ValidParentheses VP = new ValidParentheses() ;
		System.out.println(VP.isValid(s));
	}

}
