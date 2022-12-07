package Condtional;
import java.util.*;
public class EvenOdd {
public static void main(String []args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value of a : ");
	int a=sc.nextInt();
	
	if((a%2==0))
	{
		System.out.println(a + " is Even Number.");
	}
	else 
		System.out.println(a + " is Odd Number.");
		
	sc.close();
	
	
}
	
}
