package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "Hello";
		System.out.println(S);
		StringBuffer br = new StringBuffer() ;
		for (int i = S.length()-1 ; i >= 0 ; i--){
			br.append(S.charAt(i));
		}
		System.out.println(br);

	}

}
