package Exception;

public class Examples {
 public static void main(String[] args) throws InterruptedException {
	 System.out.println("Hi");
	 Thread.sleep(2000);
	 System.out.println("Hello");
	 int a=10,b=0,c=0;

  try {
	c=a/b;  //Risky code
	
    }
	catch(ArithmeticException a1) {
		System.out.println(a1.getMessage());
		//
		b=2;
		//c=a/b;
	} 
	 System.out.println(c);
	 
	 
}
	
	
	
}
