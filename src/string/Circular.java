package string;

import set1.util.ScannerValidate;

public class Circular {

	public static void main(String[] args) {
		System.out.println("enter First the string");
		String sentence = ScannerValidate.scanner.next();
		System.out.println("enter Second the string");
		ScannerValidate.scanner.nextLine();
		String sentenceTwo = ScannerValidate.scanner.next();
		if (isCircular(sentence, sentenceTwo)) {
			System.out.println("String is rotational");
		} else {
			System.out.println("String not is rotational");
		}

	}
	public static boolean isCircular(String string1, String string2) {
		return (string1.length() == string2.length()) && ((string1 + string1).indexOf(string2) != -1);

	}
}
