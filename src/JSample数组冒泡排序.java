
public class JSample数组冒泡排序 {

	public static void main(String[] args) {
		int[] i={23,90,45,65,109};                      //i数组
	for(int a=1;a<i.length;a++) {                      //设一个变量a,a等于1，小于数组的最长值，正循环
		for(int y=i.length-1;y>=a;y--) {               //设一个变量y,y等于i数组的倒数第一位，（数组角标）y大于等于a,倒循环
			if(i[y-1]>i[y]) {                          //如果i数组的倒数第一位小于倒数第二位

				int t=i[y];                            //设一个变量t等于数组的倒数第一位
				i[y]=i[y-1];                            //倒数第二位的数值就换到倒数第一位的位置
				i[y-1]=t;                               //倒数第一位的数值就换到倒数第二位的位置
			}
		}

	}
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
	}

}
