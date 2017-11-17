package String;

public class SumOfTwoNumber {
	
	static int Add(int x, int y)
	{
	    if (y == 0)
	        return x;
	    else
	        return Add( x ^ y, (x & y) << 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1 ;
		int b = 2 ;
		System.out.println("The Sum is :" + Add(a,b));

		

	}

}
