package Inheritance;

public class son extends father {
 public void bike() {
	 System.out.println("Bike");
 }
 
	public static void main(String[] args) {
		son sn=new son();
		sn.bike();
		sn.home();
		sn.money();
	}
}
