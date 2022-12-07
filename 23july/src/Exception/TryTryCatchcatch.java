package Exception;

public class TryTryCatchcatch {
	public static void main(String[] args) {
		int a=20,d=0,c=0;
		int [] b={23,45,89,43};
		
		try {
			try {
				c=a/d;
			}
			
			catch(ArithmeticException k)
			{
				d=2;
				c=a/d;
			}
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			
			System.out.println(b[3]);
			
			
		}
System.out.println(c);

		
		
	}
	
}
