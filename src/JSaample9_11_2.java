
public class JSaample9_11_2 {

	public static void main(String[] args) {
		disp(1);
		disp(2);
		disp(3);
	}
	private static void disp(int no) {

		int n[]= {18,29,36};


     try {

			System.out.println(n[no]);
		}

	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("超出范围");
	return;
	}
     finally{
		System.out.println("终了");
	}
}
}
