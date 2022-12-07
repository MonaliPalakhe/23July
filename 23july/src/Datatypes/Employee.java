package Datatypes;
import java.util.*;
public class Employee {
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);// constructor for user input

	    System.out.println("Enter name, address age and salary:");

	    // String input
	    String empName = sc.nextLine();
	    String empAddress = sc.nextLine();

	    // Numerical input
	    int empAge = sc.nextInt();
	    double empSalary = sc.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + empName);
	    System.out.println("Address: " + empAddress);
	    System.out.println("Age: " +empAge);
	    System.out.println("Salary: " + empSalary);
		
		sc.close();
		
		
		
	}
	

}
