package Condtional;

import java.util.Scanner;
public class palindromOrNot {
 public static void main(String[] args) {
		int temp,sum=0,r;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n: ");
    int n=sc.nextInt();
    temp=n;
    while(n>0) {
    	r=n%10;//getting remainder.
    	sum=sum*10+r;
    	n=n/10;
    }
    if(temp==sum) {
    	System.out.println("Number is Palindrom Number.");
    }
    else {
    	System.out.println("Number is not Palindrom Number.");
    }
    
 }
}
