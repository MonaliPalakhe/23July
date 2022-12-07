package Package1;

public class ThisKeyword extends SuperKeyword{

	float sal=120000.00f;
	public void salary() {
		System.out.println("Updated Salary Updated :" +this.sal);
		System.out.println("Previous Salary is : "+super.sal);
	}
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword();
		tk.sal();
		tk.salary();
	}
}
