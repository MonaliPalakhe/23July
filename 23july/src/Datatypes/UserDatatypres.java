package Datatypes;
import java.util.*;
public class UserDatatypres {
	public static void main(String[]args) {
 		
    Scanner sc=new Scanner(System.in);// constructor for user input
    System.out.println("--->Student Information<---");
   
    //String user input 
    System.out.println("Enter studName : ");
    String studName=sc.nextLine();
    
    System.out.println("Enter studAddress");
	String studAddress=sc.nextLine();
	
	System.out.println("Enter studEmailId");
	String studEmailid=sc.nextLine();
	
	// integer and long user input
   
    System.out.println("Enter studRollNumber :");
    int studRollNumber=sc.nextInt();
    
	System.out.println("Enter studContactNumber :");
	long studContactNumber=sc.nextLong();
	
	
	
	System.out.println("--->Student Information<---");
	System.out.println("Student Name :- " +studName);
	System.out.println("Student RollNumber :- " +studRollNumber);
	System.out.println("Student Email Id :" +studEmailid);
	System.out.println("Student ContactNumbar :- " +studContactNumber);
	System.out.println("Student Address :- " +studAddress);
	
	sc.close();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
