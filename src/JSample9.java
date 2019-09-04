
public class JSample9 {

	 private static Object lnteger;

	public static void main(String[] args) {

	  // 从1到1百万的每一个数
	  // 取这个数，各个位数
	  // 求和
	  // 看能不能整除9
	  // 如果能整除，那这个数也必然能整除
	  // 将这个数打印出来

	  for(int i = 1; i<=1000000;i++) {
	   // 取这个数，各个位数
	   // 例 i=12345，k={1,2,3,4,5}
	   int k[]=取得这个数的各个位数(i);

	   // 求和
	   // 例 k={1,2,3,4,5} ,j=15
	   int j = 取得数组的合计(k);

	   // 看能不能整除9
	   // 如果能整除，那这个数也必然能整除
	   if(j%9==0 && i%9==0) {
	    // 将这个数打印出来
	    System.out.println(i);
	   }
	  }
	 }

	private static int 取得数组的合计(int[] k) {
		int x=0;
		for(int l=0;l<k.length;l++) {
			x=x+k[l];
		}
		return x;
	}

	private static int[] 取得这个数的各个位数(int i) {
		String s=i+"";
		String ss[]=s.split("");
		int j[]=new int[s.length()];
		for(int k=0;k<s.length();k++) {
			j[k]=lnteger.parselnt(ss[k]);
		}
		return j;
	}

	}