package Package2;
import Package1.classA;
public class classC extends classA {
	
	public static void main(String[] args) {
		classC x=new classC();
		System.out.println(x.a);//Calling public access specifier
	//	System.out.println(x.b);//Calling default access specifier
	//	System.out.println(x.c);//Calling private access specifier
		System.out.println(x.d);//Calling protected access specifier

		
	}
}
