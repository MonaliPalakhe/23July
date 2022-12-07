package StaticNonStatic;

public class GlobalLocalVariable {
     static int a=10;//outside method or Block Global Variable
      public void test() {
    	  int c=20;//Inside method Local variable or Non-Static Variable
    	  System.out.println("Local Variable :"+c);  
    	  
      }
	
      public static void main(String []args) {
    	  GlobalLocalVariable x=new GlobalLocalVariable();
    	  x.test();
    	  System.out.println("Global Variable :"+a);   
      }
}
