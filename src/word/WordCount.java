package word;

import set1.util.ScannerValidate;

public class WordCount{
	
	public static void main(String[] args) {
		String input ="";
		int vowelCount=0;
		boolean accept = true;
		do {
			System.out.println("1> Input a Sentence");
			System.out.println("2> Count the words in the sentence");
			System.out.println("3> Count the number of vowels in the sentence");
			System.out.println("4> Return the array of words from the sentence");
			System.out.println("5> Exit");
			int n = ScannerValidate.getValidInt();
			switch (n) {
			case 1:
				ScannerValidate.scanner.nextLine();
				System.out.println("Enter the Sentence");
				input=ScannerValidate.scanner.nextLine();
				break;
			case 2:
				System.out.println("Word Count :"+wordCount(input));
				break;
			case 3:
				for(int i=0;i<input.length();i++)
					if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
						vowelCount++;
				System.out.println("Vowel Count:"+vowelCount);
				break;
			case 4:
				String arr[] = new String[wordCount(input)];
				String nstr = "";
				for (int i = 0, j = 0; i < input.length(); i++) {
					if (input.charAt(i) == ' ') {
						arr[j] = nstr;
						j++;
						nstr = "";
					} else {
						nstr = nstr + input.charAt(i);
					}
					arr[j] = nstr;
				}
				System.out.println("The array of words: ");
				for(int i=0;i<arr.length;i++)
					System.out.println(arr[i]);
				break;
			case 5:
				accept = false;
				break;
			default:
				System.out.println("Invalied choice");

			}
		} while (accept);
	}
public static int wordCount(String input)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
			if(input.charAt(i)==' ')
				count++;
		return count+1;
	}
}
