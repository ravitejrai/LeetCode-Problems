package String;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main (String [] args){
		Set<Integer> unique_num = new HashSet<Integer>();
		int n=2,x,s=0; 
		while(true)
		{
			while(n > 0)
			{
				x=n%10;
				n=n/10;
				s=(x*x)+ s;	
			}
			System.out.println(s);
			if(s==1){
				System.out.println("The number is happy");
				break;
			}
			if (unique_num.contains(s)){
				System.out.println("not happy");
				break;
			}
				unique_num.add(s);
				n=s;
				s=0;
		}
	
	}
}
