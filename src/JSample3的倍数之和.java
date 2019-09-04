
public class JSample3的倍数之和 {

	public static void main(String[] args) {
		int i=0;
		int	倍数之和=0;
		for(i=3;i<=200;i++) {
			if(i%3==0) {
				倍数之和 = 倍数之和 + i;
			}

		}
		System.out.println(倍数之和);
	}
}

