package matrix;

import set1.util.ScannerValidate;

public class Matrix{


public static void main(String[] args) {
		System.out.println("Enter the string");
		String str = ScannerValidate.getString();
	System.out.println("Enter the length");
		int length=ScannerValidate.getValidInt();
		char array[] = new char[100];
		for(int i=0;i<str.length();i++) {
			for(int j=1;j<str.length()-1;j++) {
				 substring(str+str,array,i,j);  
			}
			
	}

}

	private static void substring(String str, char[] array, int i, int j) {
		int c = 0;  
		   while (c < j) {  
		      array[c] = str.charAt(i+c);  
		      c++;  
		   }  
		   array[c] = '\0';
		   if(c==3)
		   System.out.println(array);
	}
}