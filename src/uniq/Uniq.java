package uniq;

import set1.util.ScannerValidate;
public class Uniq {
	public static void main(String argd[]) {
		System.out.println("enter the string");
		String sentence = ScannerValidate.scanner.next();
		if (isUniq(sentence)) {
			System.out.println(" String Unique");
		} else
			System.out.println(" String not Unique");
	}

	public static boolean isUniq(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j< str.length(); j++) {
				if (str.charAt(i)==(str.charAt(j))) {
					return false;
				}
				
			}
		}
		return true;
	}

}
