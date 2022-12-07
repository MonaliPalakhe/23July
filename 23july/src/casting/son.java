package casting;

public class son  extends father{
   public void bike() {
	   System.out.println("Sons bike is here.");
   }
   public void home() {
		 System.out.println("own property is here.");
	 }
	 public void car() {
		 System.out.println("Fathers property car is here.");
	 }
public static void main(String[] args) {
	father s=new son();//up casting syntax
	s.car();//super class method.
	s.home();//super class method.

}

}
