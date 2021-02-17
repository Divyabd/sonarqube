package practice19;

import set1.util.ScannerValidate;

public class Triplet {

	public static void main(String[] args) {
		System.out.println("Enter the arraySize");
		int n = ScannerValidate.getValidInt();
		int[] array = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			array[i] = ScannerValidate.getValidInt();

		}
		int count = 0;
		for (int j = 0; j < n - 1; j++) {
			for (int k = j; k < n; k++) {
				if (array[j] == array[k]) {
					if ((k - j) == 2) {
						count++;
						System.out.println("false");
						break;
					}
				} else

					j = k;
			}

		}
		if (count > 0) {

		} else
			System.out.println("True");

	}

}
