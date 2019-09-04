
public class JSample冒泡排序 {

	public static void main(String[] args) {
		int[] i= {1,9,6,55,33};
		for(int a=1;a<i.length;a++) {
			for(int y=i.length-1;y>=a;y--) {
				if(i[y]<i[y-1]) {
					int t=i[y];
					i[y]=i[y-1];
					i[y-1]=t;
				}
			}
		}

		//for(int k:i){
		                  for(int k=0;k<i.length;k++) {
			//System.out.println(k);
		                	  System.out.println(i[k]);
		}
	}

}
