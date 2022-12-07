package Constructor;
import java.util.Scanner;
public class employee {
	int eID;
	float eSal;
	String eNM;
	String eDesign;
	employee(int id,float sal) {
		 eID=id;
		 eSal=sal;
	 }
	employee(String name,String design) {
		eNM=name;
		eDesign=design;
	}
public void	employeeInfo(){
	System.out.println("Employee ID :" +eID);
	System.out.println("Employee eSalary :" +eSal);}
public void employeeInfo1() {
	System.out.println("Employee eName :" +eNM);
	System.out.println("Employee eDesignation :" +eDesign);
}
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee ID :");
	int eID=sc.nextInt();
	System.out.println("Enter the Employee Name :");
	String eName=sc.next();
	System.out.println("Enter the Employee Designation :");
	String eDesignation=sc.next();
	System.out.println("Enter the Employee Salary :");
	float eSalary=sc.nextFloat();
	employee emp=new employee(eID,eSalary);
	employee emp2=new employee(eName,eDesignation);
	emp.employeeInfo();
	emp2.employeeInfo1();
	sc.close();
 }
	 
}
	
