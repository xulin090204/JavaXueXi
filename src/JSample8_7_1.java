
public class JSample8_7_1 {

	public static void main(String[] args) {
		int data[];

		除法(15,4);
		除法(7,0);

	}

	private static void 除法(int n1, int n2) {
		if(n2==0) {
			System.out.println("0");
			return;
		}
		System.out.println(n1+"/"+n2+"="+(n1/n2));
		return;
	}

}
