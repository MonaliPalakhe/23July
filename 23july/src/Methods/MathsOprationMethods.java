package Methods;
import java.util.Scanner;
public class MathsOprationMethods {
public static void main(String[]args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The value of a and b : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	addition(a,b);
	subtraction(a,b);
	multiplication(a,b);
	
	sc.close();
 }
	
public static void addition(int a,int b) {
	int c=a+b;
	System.out.println("Addtion is:"+c);
	//return c;
}
public static void subtraction(int a,int b) {
	int c;
	if(a>b) {
		c=a-b;
	}
	else {
		c=b-a;
	}
	System.out.println("subtraction is: "+c);
}

public static void multiplication(int a,int b) {
	if (a!=0 || b!=0)
		{int c=a*b;
	System.out.println("multiplication is: "+c);
}
}}
