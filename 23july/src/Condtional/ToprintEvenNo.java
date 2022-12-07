package Condtional;
import java.util.Scanner;
public class ToprintEvenNo {
 public static void main(String[]args) 
 {
	 //Scanner class object
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter largest Even Number : ");
	 int evenNum=sc.nextInt();
	 for(int i=0;i<=evenNum;i+=2)
	 {
		System.out.println(i); 
	 }
	 
	 
	 sc.close();
 }
	
}
