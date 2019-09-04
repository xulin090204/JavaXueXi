
public class jsample8_12_1 {

	public static void main(String[] args) {
		if(args[0].equals("你叫什么名字")) { //2019-8-1 比较两边的字符串是否一致（equals）
			System.out.println("我叫----");
			System.exit(1);
		}
		if(args[0].equals("今天天气怎么样")) {
			System.out.println("今天天气晴，最高气温不知道，最低气温也不知道");
			System.exit(1);
		}


//		if(args.length !=3) {
//			System.out.println("nide");
//			System.out.println("JSample");
//
//			System.exit(1);
//		}
		System.out.println(" ["+args[0]+"]");
		System.out.println(" ["+args[1]+"]");
		System.out.println(" ["+args[2]+"]");

	}

}
