package polymorphism;
class stude{
	public void name(String name) {
		System.out.println("Student name is :"+name);
	}
	public void income(float marks) {
		System.out.println("Student marks are : "+marks);
	}
}
class employ extends stude{
	public void name(String name) {
		System.out.println("Employee Name is :"+name);
	}
	public void income(float salary) {
		System.out.println("Employee Salary is : "+salary);
	}
}
public class studOvRiding {
  public static void main(String[] args) {
	  employ em=new employ();
	em.name("Monali");
	em.income(137800f);
}
}
