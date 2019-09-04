
public class JSample闰年 {

	public static void main(String[] args) {
		//目标：打印1900年-2000年之间的闰年								UI 			设计
		//步骤：															SS			设计
		//      1. 取得1900-2000的数
		//      2. 判断1900-2000之间的数是不是闰年
		//        2.1 如果这个数能被4整除,且不能被100整除，还要被400整除就是闰年
		//        2.2 用这个数整除4
		//        2.3 如果这个数被整除，==0，就是闰年
		//            返回 （true）判断结果 = true
		//        2.4 否则不是闰年
		//            返回 （false）判断结果 = false
		//      3.是闰年就打印。否则无视
		//        3.1 闰年判断结果 == true 是闰年
		//        3.2打印闰年
		int n = 0;
		int i = 0;


		for(i=1900;i<=2000;i++) {

			boolean 结果=判断闰年(i);

			if(结果 == true) {

				System.out.println(i+"年");
			}

		}
	}

	private static boolean 判断闰年 (int n) {


		if (n%4 ==0&&n%100!=0||(n%400==0)) {

				// == 0 表示能整除，说明是闰年
				return true; // 是闰年
			}


		return false;
				// 不是闰年
	}
}
