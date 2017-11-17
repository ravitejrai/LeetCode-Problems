package String;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 1534236469;
			int result = 0 ;
			System.out.println(Integer.MAX_VALUE);
			while ( n != 0){
				result = result*10 + n % 10 ;
				n = n/10 ;
				if(result > Integer.MAX_VALUE) 
					System.out.println("zero");
			}
			System.out.println(result);
	}

}
