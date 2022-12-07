package polymorphism;
class ride{
	public void test() {
		System.out.println("Method Example.");
	}
}
public class overriding extends ride {
	public void test() {
		System.out.println("Method Example OverRide");
	}
	public static void main(String[] args) {
		overriding ov=new overriding();
		ov.test();
	}
   
}
