package String;

public class HammingDistance {
	
	static int hammingdistance(int x , int y){
		int total = 0 ;
		String count =  Integer.toBinaryString(x ^ y);
		System.out.println(count);
		for ( int i = 0 ; i < count.length() ; i++){
			if (count.charAt(i) == '1')
				++total ;
		}
		return total ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x = 2 ;
			int y = 4 ;
			hammingdistance(x,y);
	}

}
