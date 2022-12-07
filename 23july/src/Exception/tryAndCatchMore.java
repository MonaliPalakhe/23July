package Exception;

public class tryAndCatchMore {
	public static void main(String[] args) {
		int a=20,d=0,c=0;
		int [] b={23,45,89,43};
		
		try {
		
		System.out.println(b[4]);
		
		}
		
		catch(ArrayIndexOutOfBoundsException f)
		{
			
			System.out.println(b[3]);
		}
		try {
			c=a/d;
		}
		
		catch(ArithmeticException k)
		{
		d=2;
		c=a/d;
		}
		
		System.out.println(c);
		
		
	}
}
