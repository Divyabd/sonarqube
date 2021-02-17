package finfcircular;

import set1.util.ScannerValidate;
public class FindCircular {
	public static void main(String[] args) {
		//Scanner variable = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = ScannerValidate.getStringValied();
		System.out.println("Enter the length");
		int length=ScannerValidate.getInt();
		char array[] = new char[100];
		for(int i=0;i<str.length();i++) {
			for(int j=1;j<str.length()-1;j++) {
				 substring(str+str,array,i,j,length);  
			}
			
	}

}

	private static void substring(String str, char[] array, int i, int j,int length) {
		int c = 0;  
		   while (c < j) {  
		      array[c] = str.charAt(i+c);  
		      c++;  
		   }  
		   array[c] = '\0';
		   if(c==length)
		   System.out.println(array);
	}
}