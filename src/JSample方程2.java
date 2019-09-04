
public class JSample方程2 {

	public static void main(String[] args) {
		//已知 XYZ+YZZ=532
		int x=0;
		int y=0;
		int z=0;
		for(x=0;x<=9;x++) {
			for(y=0;y<=9;y++) {
				for(z=0;z<=9;z++) {

					int a= x*100 + y*10 + z;

					int b=y*100 + z*10 + z;

					if(a+b==532) {

							System.out.println("x="+x);
							System.out.println("y="+y);
							System.out.println("z="+z);

						return ;

					}


					//return false;


				}
			}
		}
	}

}
