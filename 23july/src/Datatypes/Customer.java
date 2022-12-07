package Datatypes;
import java.util.*;
public class Customer {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);// constructor for user input
         
		//String input from user
		
		System.out.println("Enter Customer Name : ");
		String custName=sc.nextLine();
		
		System.out.println("Enter Customer Address : ");
		String custAddress=sc.nextLine();
		
		System.out.println("Enter Customer Email ID : ");
		String custEmailId=sc.nextLine();
		
		
		//double,long input from user
				
		System.out.println("Enter Customer Contact No :");
		long custContact=sc.nextLong();
		
		System.out.println("Enter Customer Bill no : ");
		short custBillNo=sc.nextShort();
		
		System.out.println("Enter Customer Total bill :");
		double custBillAmt=sc.nextDouble();
		
		System.out.println("--->Customer Details<---");
		System.out.println("Customer Name : "+custName);
		System.out.println("Customer Address  : "+custAddress);
		System.out.println("Customer Email Id : " +custEmailId);
		System.out.println("Customer Contact no : " +custContact);
		System.out.println("Customer Bill No : " +custBillNo);
		System.out.println("Customer Bill Amount : "+custBillAmt);
		
		sc.close();
		
		
	}
}
