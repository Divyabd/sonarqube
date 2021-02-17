package inconTax;

import set1.util.ScannerValidate;

public class Income {

	public static void main(String[] args) {
		System.out.println("enter emp salary");
		long salary = ScannerValidate.getValiedLong();
		double print = result(salary);
		System.out.println("tax=" + print);

	}

	public static double result(long salary) {
		if (salary <= 50000) {
			return 0;
		} else if (salary > 50000 && salary <= 60000) {
			double value = salary * (0.1);
			return value;

		} else if (salary > 60000 && salary <= 150000) {
			double value = salary * (0.2);
			return value;

		} else if (salary > 150000) {
			double value = salary * (0.3);

			return value;
		} else
			return salary;
	}
}
