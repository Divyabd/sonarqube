package prime;

import set1.util.ScannerValidate;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the array Size");
		int n = ScannerValidate.getInt();
		int[] arrayOne = new int[n];
		//int count = 0;
		int s = 0;
		int[] array = new int[n];
		for (int t = 0; t < n; t++) {
			array[t] = ScannerValidate.getInt();
		}
		System.out.println(" elements are");
		
		
		int j = 2, p = 1;
		for (int i = 0; i < n; i++) {

			while (j < array[i]) {
				if (array[i] % j == 0) {
					p=0;
					System.out.println(array[i]);
					break;
				}
				j++;
			}
			if (p==1) {
				
				arrayOne[s] = array[i];
				s++;
			}

		}

		for (int m = 0; m < n; m++)
			if (arrayOne[m] == 0) {

			} else
				System.out.println();
	}

}
