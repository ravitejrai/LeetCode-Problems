package String;

public class NeedleInHaystack {
	
	static int checkNeedleInHaystack(String haystack , String needle){
		
		/*int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;*/
		return haystack.indexOf(needle);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = "aayuhyus is" ;
			String b = "is";
			a.toLowerCase();
			b.toLowerCase();
			System.out.println(checkNeedleInHaystack(a,b));
			
	}

}
