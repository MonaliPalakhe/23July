package operators;
import java.util.*;
public class ByteOperators {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		//byte(-128 to 127) user input
		
		System.out.println("Enter byte value of a :");
		byte a=sc.nextByte();
		
		System.out.println("Enter byte value of b :");
		byte b=sc.nextByte();
		
		//Operators operations
		
		System.out.println("Addition of a and b is :"+(a+b));
		System.out.println("Multiplication of a and b is :"+(a*b));
		System.out.println("Division of a and b is :"+(a/b));
		System.out.println("Modulus of a and b is :"+(a%b));
		
		if(a>b)
			System.out.println("Subtraction of anad b is :"+(a-b));
		else
			System.out.println("Subtraction of b and a is :"+(b-a));
		
		sc.close();
	} 
	
	

}
