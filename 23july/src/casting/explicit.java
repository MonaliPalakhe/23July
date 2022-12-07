package casting;

public class explicit {
	public static void main(String[] args) {
		double a= 90.78;//8 byte memory size.
		System.out.println(a);
		
	   int b=(int) a;//Memory size 4 byte.
	   System.out.println(b);
	   
	   byte c=(byte) b;//memory size 1 byte
	   System.out.println(c);
	   
	}
}
