package polymorphism;
class stud{
	public static void stud(int rollno) {
		System.out.println("Student roll no is:"+rollno);
	}
	public static void stud(String name) {
		System.out.println("Student name is :"+name);
	}
	public  void stud(float marks) {
		System.out.println("Student Marks Are :"+marks);
	}
}
public class Student extends stud {
	
 public static void main(String[] args) {
	 stud std=new stud();
	 std.stud("Sahil");
	 std.stud(34);
	 std.stud(98.00f);
	 
}
}
