package String;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 243;int r =0;
		/*int q = -1; 
		while ( n == 1){
		while (n > 0 && q!=1 && r!=0 ){
			q = n/3;
			r = n%3;
			n = n/3 ;
		}
		}
	
			System.out.println(n+" "+r);
		if(q==1 && r==0)
			System.out.println("true");
		else		
			System.out.println("n is not power of three");
	}
*/
		
	/*	int n = 3;
		
		double x = (Math.log10(n)/Math.log10(3));
		
		if ( x == Math.ceil(x)){
			System.out.println("power of three");		
		}
		else
			System.out.println("Not power of Three");*/
		
		while(r==0 && n>3)
		{
			n=n/3;
			r=n%3;	
			System.out.println(n);
		}
		
		if(r==0)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
