package operators;
import java.util.*;
public class ShortOperator {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);//Constructor for user input
		
		
		//short user input
		System.out.println("Enter Short value of a :");
		short a=sc.nextShort();
		System.out.println("Enter Short value of b :");
		short b=sc.nextShort();
		
		//operators operations
		System.out.println("Addition of a and b is :"+(a+b));
		System.out.println("Multiplication of a and b is :"+(a*b));
		System.out.println("Modulus of a and b is :"+(a%b));
		System.out.println("Division of a and b is :"+(a/b));
		if(a>b)
		System.out.println("Subtraction of a and b is :"+(a-b));
		else
			System.out.println("Subtraction of b and a is :"+(b-a));
		sc.close();
		
	}
}
