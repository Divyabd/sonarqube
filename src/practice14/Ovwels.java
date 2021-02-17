package practice14;

import set1.util.ScannerValidate;

public class Ovwels {

	public static void main(String[] args) {
		System.out.println("Enter the Sentence");
		String input=ScannerValidate.scanner.nextLine();
		int vowelCount=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
				vowelCount++;
		}
		System.out.println(vowelCount);

	}

}
