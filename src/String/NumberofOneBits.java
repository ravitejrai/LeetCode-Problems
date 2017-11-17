package String;

public class NumberofOneBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11 ;
		int count = 0;
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		for (int i = 0 ; i < s.length() ; i++){
			if ( s.charAt(i) == '1'){
				count ++ ;
			}
		}
		System.out.println(count);
		System.out.println(Integer.MAX_VALUE);
		
	}

}
