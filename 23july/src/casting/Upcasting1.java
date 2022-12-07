package casting;

public class Upcasting1 extends UpCasting{
	public void demo() {
   	 System.out.println("demo method in sub class is here");
    }
    public void demo2() {
   	 System.out.println("demo2 method in sub class is here");
    }
   static void test2() {
	   System.out.println("Subclass static method is here.");
   }
   
   public static void main(String[] args) {
	   UpCasting x=new UpCasting();//UP casting
	   x.demo();
	   x.demo2();
	   UpCasting.test();//Super class all methods
	   
	   
	   System.out.println("---->Down Casting<---");//Down casting...
	   Upcasting1 s1=(Upcasting1) new UpCasting();
	   s1.demo();
	   s1.demo2();
	   
}
}
