
public class JSample乘法 {

	public static void main(String[] args) {
		int num1, num2;

		num1 = 5;
		num2 = 6;
		keisan1(num1, num2);
		keisan2(num1, num2);
		keisan3(num1, num2);
		keisan4(num1, num2);
	}

	private static void keisan1(int n1, int n2) {
		System.out.println("num1=" + (n1 + n2));

	}

	private static void keisan2(int n1, int n2) {

		System.out.println("num2=" + (n1 - n2));

	}

	private static void keisan3(int n1, int n2) {

		System.out.println("num3=" + n1 * n2);

	}

	private static void keisan4(int n1, int n2) {

		System.out.println("num4=" + n1 / n2);
	}
}
