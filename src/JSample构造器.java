
public class JSample构造器 {
	JSample构造器(){
		this("波斯猫",1);
		System.out.println("1");
	}
	JSample构造器 (String name){
		this(name,1);
		System.out.println("2");
	}
	String name;
	int age;
	JSample构造器 (String name,int age){
		System.out.println("3");
		this.name=name;
		this.age=age;
		System.out.println("4");
	}
	public static void main(String[] args) {
		new JSample构造器 ();
		new JSample构造器 ("小花");
	}

}
