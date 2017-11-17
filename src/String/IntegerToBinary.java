package String;

import java.math.BigInteger;

public class IntegerToBinary {
	
	static void ItoB (int n){
		StringBuilder sb = new StringBuilder();
		String x = Integer.toBinaryString(n);
		//System.out.println(x);
		System.out.println(sb.append(x));
		System.out.println(sb.length());
		System.out.println("Reversed String");
		System.out.println(sb.reverse());
		//int decimal = Integer.parseUnsignedInt(sb.reverse(), 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 432;
		ItoB(n);
	}

}
