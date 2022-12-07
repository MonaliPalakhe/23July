package test;
import java.util.*;
public class Userinput {
	public static void main(String[]args) {
		//input from console
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=sc.nextInt();
		System.out.println("Enter the value of b :");
		int b=sc.nextInt();
		int c=a+b;
		System.out.print(c);
		
		sc.close();
		
	}
	

}
