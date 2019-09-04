
public class JSample100以内的素数 {

	public static void main(String[] args) {
		//100以内的素数
		int n = 0;
		int i = 0;

		// 100以内 ---
		for (i = 2; i <= 100; i++) {
			// 判断素数
			boolean 结果=判断素数(i);

			if(结果 == true) {
				System.out.println(i);
			}
		}

	}

	private static boolean 判断素数(int n) {
		// 1和本身之外都不能整除
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				// == 0 表示能整除，说明不是素数
				return false; // 不是素数
			}
		}

		return true;// 是素数
	}

}