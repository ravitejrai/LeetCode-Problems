package String;

public class ExcelTitleToNumber {
	
	 private int BASE = 26;
	    
	    // start number for single number
	    private int START = 1;
	    
	    public String convertToTitle(int A) {
	        StringBuilder strBuilder = new StringBuilder();
	        while (A != 0) {
	            strBuilder.insert(0, (char) ((A - START) % BASE + 'A'));
	            A = (A - START) / BASE;
	        }
	        System.out.println(strBuilder);
	        return strBuilder.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelTitleToNumber A = new ExcelTitleToNumber();
		System.out.println(A.convertToTitle(603));
	}

}
