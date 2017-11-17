package String;

public class MergeTwoArrays {
	
/*	public static int [] merge(int[] num1, int[] num2, int m, int n, int[] num3){
		int i = 0 ;
		int j = 0 ;
		int k = 0 ;
		if (num1 == null ){
			return num2 ;
		}
		if (num2 == null ){
			return num1 ;
		}
		
		while (i < m && j < n){
			if ( num1[i] < num2[j]){
				num3[k++] = num1[i++];
			}
			else
				num3[k++] = num2[j++];
		}
			
			while ( i < m ){
				num3[k++] = num1[i++];
			}
			
			while ( j < n ){
				num3[k++] = num2[j++] ;
			}
		return num3 ;
	}*/
	
	
	static void merge (int[] num1, int[] num2, int m, int n){
			int k = 0;
			for ( int i = 0 ; i < m ; i++){
				if (num1[i] == 0){
					k = i ;
				break;
				}
			}
			System.out.println(k);
			int j = num2.length -1 ;
			m = m-1 ;
			while ( m > 0){
				if (num1[k-1] > num2[j]){
					num1[m--] = num1[k-1];
					num1[m--] = num2[j];
					k--;
					j--;
				}
				else{
					num1[m--] = num2[j];
					num1[m--] = num1[k-1];
					j--;
					k--;
				}
			}
			for ( int t = 0 ; t < num1.length ; t++){
				System.out.print(num1[t] + " ");
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []num1 = new int [6];
		int m = num1.length ;
		//System.out.println(m);
		num1[0] = 1 ;
		num1[1] = 2 ;
		num1[2] = 3 ;
		//System.out.println(num1[0] + " " + num1[1] + " " +num1[2] + " " +num1[3] + " " +num1[4]);
		int []num2 = {2,5,6} ;
		int [] num3 = new int [num1.length + num2.length] ;
		
		//System.out.println(m);
		int n = num2.length ;
		
		merge(num1 , num2 , m , n) ;
		
	}

}
