package matrixCircular;

import set1.util.ScannerValidate;

public class SquareDist {
	static boolean check(char[][] square, String input) {
		int row = 0;
		int col = 0;
		int diag1 = 0;
		int diag2 = 0;
		if (input.length() > square.length)
			return false;
		for (int i = 0; i < square.length; i++)
			if (square[0][i] == input.charAt(i))
				row++;
			else if (square[i][0] == input.charAt(i))
				col++;
			else if (square[i][i] == input.charAt(i))
				diag1++;
		for (int i = 0; i < square.length; i++)
			for (int j = square.length - 1; j >= 0; j--)
				if (square[i][j] == input.charAt(i))
					diag2++;
		if (row == input.length() || col == input.length() || diag1 == input.length() || diag2 == input.length())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		char[][] square = new char[0][0];
		int size = 0;
		boolean accept = true;
		do {
			System.out.println("1. Enter the dimension of the Square Matrix");
			System.out.println("2. Fill the matrix with characters");
			System.out.println("3. Enter the string");
			System.out.println("4. Exit");
			int n = ScannerValidate.getValidInt();
			switch (n) {
			case 1:
				System.out.println("Enter the size of the matrix:");
				size = ScannerValidate.getValidInt();
				square = new char[size][size];
				break;
			case 2:
				System.out.println("Enter the characters in the matrix:");
				for (int i = 0; i < size; i++)
					for (int j = 0; j < size; j++)
						square[i][j] = ScannerValidate.scanner.next().charAt(0);
				break;
			case 3:
				ScannerValidate.scanner.nextLine();
				System.out.println("Enter the string");
				String input = ScannerValidate.scanner.nextLine();
				System.out.println("Found :" + check(square, input));
				break;
			case 4:
				accept = false;
				break;
			default:
				System.out.println("Choose between 1,2,3,4");

			}
		} while (accept);
	}

}

