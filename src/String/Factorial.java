package String;

import java.util.ArrayList;

public class Factorial {
	
/*	static ArrayList al = new ArrayList();
	//static int count = 0 ;
	static int sizecount(int n){
		int count = 0 ;
		if ( n > 0 && n%5 == 0){
			count++;
		}
		if ( count > 0){
			al.add(count);
		}
		return al.size();
	}
	
	static int fact( int n){
		
		product(n);
		return sizecount(n);
		
	}
	
	 static int product(int n){
		 sizecount(n);
         if ( n==0){
            return 1 ;
        }
        else
           return (n*product(n-1)); 
    }*/
	 
/*	static int helper(int n){
		 
		 while (n > 0){
			 double x = (Math.log10(n)/Math.log10(5));
			 if ( (int) x == x){
				 if ( x == Math.ceil(x)){
	 					count = (int) (count + x) ;
	 				}
			 }
			 else if ( n%5 == 0 ){
					count++;
 				}
				n-- ;
			
		 }
		 return count ;*/
	
	
	static int trailingzeroes(int n){
		
		int k = 0 ; int i = 5 ;
		while ( i < n){
			
			k = k + n/i ;
			i = i*5 ;
			
		}
		return k ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2000 ;
		/*System.out.println(fact(n));
		System.out.println(al.size());*/
		//System.out.println(helper(n));
		//System.out.println(product(n));
		System.out.println(trailingzeroes(n));
	}

}
