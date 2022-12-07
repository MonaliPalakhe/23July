package Inheritance;
 class This{
	int a=40;
	public void test() {
		int a=50;
		System.out.println(a);//local variable
		System.out.println(this.a);//global variable call from same class
	}
	
}
class Super extends This{
	public void test2() { 
	System.out.println(super.a);//Global variable call from Different class	
     }    
 }

public class ThisAndSuper {
 public static void main(String[] args) {
	 Super x=new Super();
	 x.test();
	 x.test2();
}
	
}
