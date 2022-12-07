package String;

public class demo {
  public static void main(String[] args) {
	String a="Class";
	String b="Class";
	
	String c=new String("Class");
	String d=new String("Class");
	System.out.println(a==b);//Same address comparison
	System.out.println(c==d);//diff address comparison

	System.out.println("------------------");
	 b="Velocity";
	 System.out.println(b);
	 System.out.println(a);
	 System.out.println(a==b);
	 
   System.out.println("------------------");
   b="Class";
   System.out.println(a);
   System.out.println(b);
   System.out.println(a==b);
  }
}
