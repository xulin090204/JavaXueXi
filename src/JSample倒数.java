
public class JSample倒数 {
	public static void main(String[] args) {
		String aa=args[0];

		char ss[] = aa.toCharArray();

		for(int i=ss.length-1; i>=0; i--) {


			System.out.print(ss[i]);
		}
	}
}