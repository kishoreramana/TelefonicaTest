package main.java;

public class NamingNumbers {

	private static int DIVISOR_1 = 3;
	private static int DIVISOR_2 = 5;

	private static String DIVISOR_1_OUTPUT = "fizz";
	private static String DIVISOR_2_OUTPUT = "bizz";
	private static String DIVISOR_1_2_OUTPUT = "fizzbizz";

	public String getNumberName(int input) {
		String result = "";
		if (input > 0) {
			if (input % DIVISOR_1 == 0 && input % DIVISOR_2 == 0) {
				result = DIVISOR_1_2_OUTPUT;
			} else if (input % DIVISOR_1 == 0) {
				result = DIVISOR_1_OUTPUT;
			} else if (input % DIVISOR_2 == 0) {
				result = DIVISOR_2_OUTPUT;
			}
		}

		return result;
	}

}
