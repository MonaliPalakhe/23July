package Inheritance;
class dog{ //Single and MultiLevel Inheritance
	void dog1() {
		System.out.println("You are Now in Dog Class");
	}
}
 class cat extends dog{
	 void cat1() {
	 System.out.println("You are Now in Cat Class");
 }
 }
class tiger extends cat{
	void tiger1() {
		 System.out.println("You are Now in Tiger Class");
	}
}

public class Animal {
   public static void main(String[] args) {
	   tiger c=new tiger();
	   c.dog1();
	   c.cat1();
       c.tiger1();
   }
}
