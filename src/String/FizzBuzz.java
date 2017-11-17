package String;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15 ;
		List<String> sb = new ArrayList<String>();
		for (int i = 1 ; i <= n ; i++){
		 if (i % 3 == 0 && i % 5 == 0) {
			 sb.add("FizzBuzz");
	        }
		 else if (i % 3 == 0){
			  sb.add("Fizz");
		 }
		 else if  (i % 5 == 0) {
	            sb.add("Buzz");
	        }
	        else  {
	            sb.add(Integer.toString(i));
	        }
		}
	        
	       System.out.println(sb);
	}
}


