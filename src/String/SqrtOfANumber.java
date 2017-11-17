package String;

public class SqrtOfANumber {
	
	public int mysqrt(int x){
		if (x == 0)
			return 0 ;
		int left = 1 ;
		int right = x ;
		while (true){
			int mid = (left + right) /2 ;
			if ( mid > x/mid)
				right = mid -1 ;
			else {
				if ( (mid+1) > x /(mid+1)){
					return mid ;
				}
				left = mid + 1 ;
			}
		}
	}
	
	public int mysolsqrt(int n){
		if (n == 0)
			return 0 ;
		if (n == 1 || n == 2)
			return 1 ;
		int i = 1 ;
		for ( i = 1 ; i< n ; i++){
			if (i > n/i){
				return i-1 ;
			}
		}
		return i-1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SqrtOfANumber sqrt = new SqrtOfANumber();
		//System.out.println(sqrt.mysqrt(8));
		System.out.println(sqrt.mysolsqrt(289));

	}

}
