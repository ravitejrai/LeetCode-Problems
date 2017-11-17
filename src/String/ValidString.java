package String;

public class ValidString {
	
	static boolean CheckValidity (String str){
		
		String x = str.toUpperCase() ;
		
		if (x.equals(str))
			return true ;
	
		if (str.toLowerCase().substring(1).equals(str.substring(1)) && x.charAt(0)==str.charAt(0)){
			return true;
		}
		
		if (str.toLowerCase().equals(str)){
			return true ;
		}
	
		return false ;
		
	}
	
	public static void main (String [] args){
		String str = "InDia" ;
		System.out.println(CheckValidity(str));
	}
}
