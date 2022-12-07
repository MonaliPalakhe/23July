package operators;
import java.util.*;
public class LongOperator {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		//long user input
		System.out.println("Enter value of a :");
		long a=sc.nextLong();
		
		System.out.println("Enter value of b :");
		long b=sc.nextLong();
		
		
		//operators operations
		
		System.out.println("Addition of a and b is : "+(a+b));
		System.out.println("Multiplication of a and b is :"+(a*b));
		System.out.println("Division of a and b is : "+(a/b));
		System.out.println("Modulus of a and b is : "+(a%b));
		if(a>b)
			System.out.println("Subtraction of a and b is : "+(a-b));
		else
			System.out.println("Subtraction of b and a is :"+(b-a));
		sc.close();
	}

}
