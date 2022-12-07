package polymorphism;
class emplyoee{
	public  void salary(float sal) {
		System.out.println("Employee salary is :"+sal);
	}
}
class emp{
	public  void salary(float sal) {
		System.out.println("Employee Final Salary : "+sal);
	}
}
public class methodOverride{
	public static void main(String[] args) {
		emp p=new emp();
		p.salary(130000f);
	}
 
}
