
public class JSample9_9_1 {

	public static void main(String[] args) {
		int i=84;
		Integer oi=new Integer(i);

		String str1=oi.toString();                                 //数值转字符串3种方法
		String str2=String.valueOf(i);
	    String str3=""+i;

	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str3);


	}

}
