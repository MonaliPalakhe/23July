package test;
public class NestedIf {
	public static void main(String[]args) {
		String useName="Monali";
		String passWord="ABC";
		if(useName=="Monali") 
		{
		  System.out.println("Username is correct");
              if(passWord=="ABC")
              {
            	  System.out.println("Password is correct.");
            	  System.out.println("Login SuccessFull");
              }
              else {
            	  System.out.println("Password is incorrect");
            	  System.out.println("Login Failed");
              }
		  
		}
		else
		{
			System.out.println("Username is incoorect.");
			System.out.println("Login Failed");
		}
				
	}
}
		