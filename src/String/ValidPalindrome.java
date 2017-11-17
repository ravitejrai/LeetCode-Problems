package String;

public class ValidPalindrome {
	
	static boolean Isvalid(String s){
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(actual);
        String rev = new StringBuffer(actual).reverse().toString();
        System.out.println(rev);
        return actual.equals(rev);
	}
	
	public static boolean isPalindrome(String s) {
		if(s == null || s.length() == 0){ 
			return true;
		}

		int start = 0;
		int end = s.length() - 1;

		char a ;
		char b;

		while(start <= end){ 
			a = s.charAt(start);
			b = s.charAt(end);

			if(!Character.isLetterOrDigit(a)){ 
				start++;
			}

			else if(!Character.isLetterOrDigit(b)){ 
				end--;
			}

			else{ 
				if(Character.toLowerCase(a) != Character.toLowerCase(b)){ 
					return false;
				}
				start++;
				end--;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama" ;
		//System.out.println(Isvalid(s));
		System.out.println(isPalindrome(s));
	}

}
