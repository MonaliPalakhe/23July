package operators;
import java.util.*;
public class ArthmaticOp {
  
	  public static void main(String[]args) {
		  
		  Scanner sc=new Scanner(System.in);
		  //User input
		  System.out.println("Enter the value of a : ");
		  int a=sc.nextInt();
		  System.out.println("Enter the value of b : ");
		  int b=sc.nextInt();
		  //Arithmetic operations
		  
		  System.out.println("Addition of a and b is : "+(a+b));
		  System.out.println("Multiplication of a and b is : "+(a*b));
		  System.out.println("Division of a and b is : "+(a/b));
		  System.out.println("Modulus of a and b is : "+(a%b));
		  
		  //Relational operators
		  
		  if(a>b)
			  System.out.println("Subtraction of a and b is : "+(a-b));
		  else
			  System.out.println("Subtraction of b and a is : "+(b-a));
		  sc.close();
		  
		  
		  
		  
		  
		  
		  
	  }
	
}
