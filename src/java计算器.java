
public class java计算器 {

	public static void main(String[] args) {
		//
		if (args.length != 3) {
			System.out.println("ni");
			System.out.println("wo");

			System.exit(1);
		}

		//
		System.out.println(" [" + args[0] + "]");
		System.out.println(" [" + args[1] + "]");
		System.out.println(" [" + args[2] + "]");

		// 2019-8-1 比较两边的字符串是否一致（equals）

		double d1=Double.parseDouble(args[0]);
		double d2=Double.parseDouble(args[2]);

     if(args[1].equals("+")){
    	 //加法(d1,d2);

    	 // 方法1
    	 System.out.println(加法(d1,d2));

    	 // 方法2
    	// double r = 加法(d1,d2);
    	 //System.out.println(r);

     }
     if(args[1].equals("-")){
    	 //减法(d1,d2);
    	 System.out.println(减法(d1,d2));
     }
     if(args[1].equals("*")){
    	 //乘法(d1,d2);
    	 System.out.println(乘法(d1,d2));
     }
     if(args[1].equals("/")){
    	//除法(d1,d2);
    	 System.out.println(除法(d1,d2));
     }

	}


	// 2019-8-1 函数里面不能再定义函数了
	private static double 加法(double d1, double d2) {

		return d1 + d2;
	}

	private static double 减法(double d1, double d2) {

		return d1 - d2;
	}

	private static double 乘法(double d1, double d2) {

		return d1 * d2;

	}

	private static double 除法(double d1,double d2) {

//	    if(d2==0){
//				System.out.println("错误");
//		    return
//	    }else {
//         if(d2!=0)
//        	System.out.println("double+double");
//	    return d1/d2;
//
//		}

//第1种写法
//	    if(d2==0){
//	    	System.out.println("错误");
//	    	return 0;
//	    }
//
//	    return d1/d2;

//第2种写法
	    if(d2==0){
	    	System.out.println("错误");
	    	return 0;
	    }else {
	    	return d1/d2;
	    }


//第3种写法
//	    if(d2==0){
//	    	System.out.println("错误");
//	    	return 0;
//	    }
//	    if(d2!=0){
//	    	return d1/d2;
//	    }
	}
}
