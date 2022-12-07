package operators;
import java.util.*;
public class OperatorDiffDT {
 public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	//User float user
	
	System.out.println("Enter float value of a :");
	float a=sc.nextFloat();
	System.out.println("Enter float value of b :");
	float b=sc.nextFloat();
	
	System.out.println("Addition a and b is : "+(a+b));
	if(a>b)
		System.out.println("Subtraction of a and b is : "+(a-b));
	else 
		System.out.println("Subtraction of b and a is : "+(b-a));
	System.out.println("Multiplication of a and b is : "+(a*b));
	System.out.println("Division of a and b is :"+(a/b));
	System.out.println("Modulus of a and b is :"+(a%b));
	sc.close();
}
}