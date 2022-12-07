package Condtional;
import java.util.*;
public class StudentResult {
	public static void main(String[]args)
	 {
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Student name : ");
		String studName=sc.nextLine();
		System.out.println("Enter the Marks of "+ studName + ":");
		short studMarks=sc.nextShort();
		
		if(studMarks>65) 
		 {
		 System.out.println(studName + " have Distinction."); 			
		 }
		else if(studMarks>55) 
		 {
			System.out.println(studName + " have First class.");
		 }
		else if(studMarks>45)
		{
			System.out.println(studName +" have Second class");
		}
		else if(studMarks>=35) 
		{
			System.out.println(studName +" is pass");
		}
		else
		{
			System.out.println(studName + " is Fail.");
		}
		
		
		
		
		
		
		sc.close();
		
		
		
	}

}
