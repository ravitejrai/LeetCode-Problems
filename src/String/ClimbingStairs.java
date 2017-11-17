package String;

public class ClimbingStairs {
	
	int fib(int n){
		
		if ( n == 2){
			return 2 ;
		}
		if ( n == 1){
			return 1;
		}
		if (n ==3){
			return 4;
		}
		else
			 return fib (n-1) + fib (n-2) + fib (n-3);
	}
	
	int fibonacci(int n){
		
		if (n == 1 || n ==2) {
	        return 1;
	    }
		int first = 1;
		int second = 2;
		 for (int i = 3; i <= n; i++) {
		        int third = first + second;
		        first = second;
		        second = third;
		    }
		 return second;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10 ;
		ClimbingStairs CS = new ClimbingStairs();
		System.out.println(CS.fib(n));
		System.out.println(CS.fibonacci(10));
	}

}
