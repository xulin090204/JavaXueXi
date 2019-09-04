
public class JSamplefor循环嵌套 {

	public static void main(String[] args) {
		int s=0;
		for(int i=1;i<5;i++) {
			for(int j=1;j<i;j++){
				s=s+i*j;
			}
		}
		System.out.println(s);
	}

}
