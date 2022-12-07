package Methods;

public class staticNonStaticBlock1 {//block is execute before main method in JAVA
	static {
		System.out.println("static Method is Running.");//static block execute before main method 
	}
	
	{
		System.out.println("Non-static Method is Running.");//non static block
	}
	public static void main(String[] args) {
		staticNonStaticBlock1 sc=new staticNonStaticBlock1();
		System.out.println("This Is main Method Execution");
		
	}
	

}
