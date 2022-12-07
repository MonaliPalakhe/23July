package Inheritance;
class salary{//MultiLevel Inheritance
	float salary=99000.00f;
	}
class Bonus extends salary{
	float bonus=salary+70000f;
}
class name extends Bonus{
	void name1() {
		System.out.println("Employee name is Monali. ");
	}
}
public class SalaryBonus {
	public static void main(String[] args) {
		name b=new name();
        b.name1();
        System.out.println("Salary Is :" +b.salary);
		System.out.println("Bonus Is :" +b.bonus);
	}
}
