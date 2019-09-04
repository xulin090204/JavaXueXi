
public class JSample方程 {

	public static void main(String[] args) {
		//已知 XYZ+YZZ=532
		int x=0;
		int y=0;
		int z=0;
		for(x=0;x<=9;x++) {
			for(y=0;y<=9;y++) {
				for(z=0;z<=9;z++) {

					//if((x+y+z)+(y+z+z)==532) {
					int a=Integer.parseInt(x+""+y+z);   //x+""表示x变为字符串
					//int b=Integer.parseInt(y+""+z+z);
					String s= y+""+z+z;
					int b=Integer.parseInt(s);

					if(a+b==532) {
						// boolean 结果=等式成立;

						//if(结果 == true) {
							System.out.println("x="+x);
							System.out.println("y="+y);
							System.out.println("z="+z);
						//return true;
						return ;

					}


					//return false;


				}
			}
		}
	}
}
