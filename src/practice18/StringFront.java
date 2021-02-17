package practice18;

import set1.util.ScannerValidate;

public class StringFront {

	public static void main(String[] args) {
		System.out.println("please enter the string");
		String str = ScannerValidate.getString();
		System.out.println("enter number of times you want to repeate");
		int num = ScannerValidate.getValidInt();
		String res = "";
		for (int i = 0; i < 3; i++) {

			res += str.charAt(i);
		}
		for (int j = 0; j < num; j++) {
			System.out.print(res);

		}

	
	}

}
