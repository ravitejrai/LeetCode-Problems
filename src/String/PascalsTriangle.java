package String;

import java.util.ArrayList;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][] num = new int[5][5];
			
			/*for ( int i = 0 ; i < num.length ; i++){
				for ( int j = 0 ; i< num[0].length ; j++){
					if (i == j){
						num[i][j] = 1 ;
						break ;
					}
					if (j ==0){
						num[i][j] = 1 ;
					}
					else {
						num[i][j] = num[i-1][j-1] + num[i-1][j] ;
					}
				}
			}
			int x= num.length;
			for ( int i = 0 ; i < num.length ; i++){
				for(int k=0;k<x;k++)
					System.out.print(" ");
				for ( int j = 0 ; j< num[0].length ; j++){
					if(num[i][j]!=0)
						System.out.print(num[i][j] + " ");
				}
				x--;
				System.out.println();
				}*/
			
			
/*			ArrayList<ArrayList<Integer>> l1 = new ArrayList<ArrayList<Integer>>() ;
			for ( int i = 0 ; i< 5 ; i++){
				ArrayList<Integer> l3 = new ArrayList<Integer>() ;
				for ( int j = 0 ; j< 5 ; j++){
					if (i == j){
						l3.add(1) ;
						break ;
					}
					if (j ==0){
						l3.add(1) ;
					}
					else {
						l3.add(l1.get(i-1).get(j-1) + l1.get(i-1).get(j));
					}
				}
				
				l1.add(l3);
			}*/
			
			ArrayList<ArrayList<Integer>> l1 = new ArrayList<ArrayList<Integer>>();
			for ( int i = 0 ; i< 5 ; i++){
				ArrayList<Integer> l2 = new ArrayList<Integer>();
				int x = (int) Math.pow(11,i);
				while ( x > 0){
					l2.add(x%10);
					x= x/10 ;
				}
				l1.add(l2);
			}
			System.out.println(l1);
	}

}
