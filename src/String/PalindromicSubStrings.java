package String;

public class PalindromicSubStrings {
	
	static int checkPalindrom ( String str){
		int count = 0 ;
		String [] substring = new String[(str.length()*(str.length()+1))/2 ];
		for ( int q = 0 ; q < str.length() -1 ; q++){
			if (str.charAt(q) == str.charAt(q+1) && q == str.length()-2){
				count = (str.length()*(str.length()+1))/2 ;
				System.out.println(count);
				return count ;
			}
		}
		
		int p = 0 ;
		for ( int i = 0 ; i < str.length() ; i++){
			for ( int j = i+1 ; j <= str.length() ; j++){
				substring[p++] =str.substring(i, j);
			}
		}
		
		for ( int k = 0 ; k < substring.length ;){
			StringBuilder sb = new StringBuilder();
			if (substring[k].length() == 1){
				count++ ;
				k++;
			}
			else if (substring[k].equals(sb.append(substring[k]).reverse().toString())){
					count++ ;
					k++;
			}
			else
				k++;
		}
		System.out.println(count);
		return count ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaaa" ;
		checkPalindrom(str);
	}

}
