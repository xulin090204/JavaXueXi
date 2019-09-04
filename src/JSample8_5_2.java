
public class JSample8_5_2 {

	public static void main(String[] args) {
		int num;
		String kekka;

		num=9;
		kekka=hantei(num);
		System.out.println(num+"wo"+kekka);

		num=6;
		kekka=hantei(num);
		System.out.println(num+"wo"+kekka);
	}

	private static String hantei(int n) {
		if(n%2==0) {
			return "偶数";
		}else {
			return"奇数";

		}

	}

}
