package Condtional;
import java.util.Scanner;
public class FibinacciSeries {
   public static void main(String[]args) 
      {
	  //Scanner class object
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Fibonacci Number :");
	   int fibNumber=sc.nextInt();
	   int n1=0,n2=1,n3;
	   System.out.print(n1+ " " +n2);
	     for(int i=2;i<=fibNumber;++i) // 0 and 1 print already..so start with 2
	     {
	    	 n3=n1+n2;
	    	 System.out.print(" "+n3);
	    	 n1=n2;
	    	 n2=n3;
	     } 
	     sc.close();
        }
	
}
