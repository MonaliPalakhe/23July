package polymorphism;
class emply{
	public void employee(String name,String designation) {
		System.out.println("Employee Name is :"+name);
		System.out.println("Employee Designation : "+designation);
	}
	public void employee(int EmpID) {
		System.out.println("Employee ID is: "+22);
	}
	public void employee(float salary) {
		System.out.println("Employee Salary is : "+salary);
	}
	
}
public class employee extends emply{
	public static void main(String[] args) {
		emply emp=new emply();
		emp.employee("MOnali","QA");
		emp.employee(23);
		emp.employee(130000.00f);
	}

}
