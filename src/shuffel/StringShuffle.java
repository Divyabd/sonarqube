package shuffel;

import set1.util.ScannerValidate;
public class StringShuffle {

	public static void main(String[] args) {

		System.out.println("please enter the string");
		String sentence = ScannerValidate.getStringValied();
		String newSent = "";
		for (int i = 0, j = sentence.length() - 1; j >= 0 && i < sentence.length(); j--, i++) {
			if (i > (sentence.length() - 1) / 2) {
				break;
			} else if (i != j) {
				char result = ScannerValidate.getCharLower(sentence.charAt(i));
				char result1 = ScannerValidate.getCharUpper(sentence.charAt(j));

				newSent += result + "" + result1;

			} else if (i == j) {
				newSent += sentence.charAt(i);
				break;
			}
		}

		System.out.println(newSent);
	}

}