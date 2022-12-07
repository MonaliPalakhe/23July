package intrface;

public class info implements emplyo {
  public  void salary() {
	  System.out.println("Salary is : 120000");
  }
 public void name() {
	 System.out.println("Name is : Monali");
 }
  public void empID() {
	  System.out.println("empID is : 120");
  }
  public static void main(String[] args) {
	info i=new info();
	i.name();
	i.empID();
	i.salary();
}
}
