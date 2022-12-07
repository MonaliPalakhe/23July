package Condtional;

public class palindrom {
  public static void main(String[] args) {
	int n,r,sum=0,temp;
	n=4334;
	temp=n;
	while(n>0) 
	{
	  r=n%10;//getting remainder
	  sum=(sum*10)+r;
	  n=n/10;
	}
  if(temp==sum) {
	  System.out.println("This is Palindrom Number.");
  }
  else 
  {
	  System.out.println("This is not Palindrom.");
  }
  }
}
