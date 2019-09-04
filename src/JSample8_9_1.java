
public class JSample8_9_1 {

	public static void main(String[] args) {
		System.out.println(sum(4,10));
		System.out.println(sum(7,2,8));
		System.out.println(sum());
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
	}
private static int sum(int... nums){
	int sum=0;

	for(int i=0; i<nums.length;i++) {
		sum+= nums[i];
	}
		return sum;
	}
}


