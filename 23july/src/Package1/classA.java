package Package1;

public class classA {
	public int a=20;
	int b=70;
	private int c=30;
	protected int d=50;
	
	
	public static void main(String[] args) {
		classA x=new classA();
		System.out.println(x.a);//Calling public access specifier
		System.out.println(x.b);//Calling default access specifier
		System.out.println(x.c);//Calling private access specifier
		System.out.println(x.d);//Calling protected access specifier

		
	}
}
