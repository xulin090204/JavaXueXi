
public class 练习1 {

	public static void main(String[] args) {
		String a = args[0];
		char[] b = a.toCharArray();
		int d = 0;
		d = b.length;
		System.out.println(d);

		for (int c = b.length - 1; c >= 0; c--) {
			System.out.print(b[c]);

		}
	}
}
