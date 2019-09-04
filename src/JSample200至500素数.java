
public class JSample200至500素数 {

	public static void main(String[] args) {
		for (int n = 200; n <= 500; n++) {

			boolean 结果 = false;

			for (int i = 200; i < n; i++) {

				if (n % i == 0) {

				结果 = false;
					break;
				}

				结果 = true;
			}
			if(结果 == true) {

				System.out.println(n);
			}
		}
	}
}
