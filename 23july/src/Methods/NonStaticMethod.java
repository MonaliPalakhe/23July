package Methods;

public class NonStaticMethod {
 public void demo() {//Non Static Method Declaration
	 System.out.println("Non static Method Example .");
 }
 public void demo2() {//Non Static Method Declaration
	 System.out.println("Non static Method Example 2 .");
 }
 public void demo3() {//Non Static Method Declaration
	 System.out.println("Non static Method Example 3 .");
 }
 public static void main(String[] args) //Main Method
 {
	 StaticMethod s=new StaticMethod();//Non static method refrence varible.
	 s.demo();
 }
}
