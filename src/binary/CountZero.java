package binary;

import set1.util.ScannerValidate;

public class CountZero {

	public static void main(String[] args) {
		System.out.println("enter Number");
		int num = ScannerValidate.getValidInt();
		String str = num(num);

		int count = count(str);
		System.out.println(count);

	}

	public static String num(int num) {
		String str = "";
		while (num > 0) {
			int result = num % 2;
			str = result + str;
			num = num / 2;
		}
		System.out.println(str);
		return str;
	}

	public static int count(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0')
				count++;
		}

		return count;

	}
}
