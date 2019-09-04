
public class JSample100以内偶数和 {

	public static void main(String[] args) {
		// 将100以内所有的偶数的[和]计算出来。
		int he = 0;
		int i = 0;

		// 100以内的 通过for循环

		for (i = 0; i <= 100;  i++) {

			// 如何判断偶数
			if (i % 2 == 0) {

				// 加到和里面
				//he+=i;
				he = he+i;
			}

		}

		System.out.println("和="+ he);
	}

}
