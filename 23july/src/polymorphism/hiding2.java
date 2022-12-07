package polymorphism;

public class hiding2  extends Hhiding{
	static void test() {
		System.out.println("Sub class Static Method");
	}
 public static void main(String[] args) {
	 Hhiding h=new hiding2();
	 h.test();
 }
}
