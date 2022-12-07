package Inheritance;
class studname{//example Hierarchical Inheritance
	void name() {
		System.out.println("Student Name is Monali.");
	}
}
class studClass extends studname{
	void classNm() {
		System.out.println("Student class is TYBCS.");
	}
	
}
class rollNo extends studname{
	void roll() {
		System.out.println("Student roll No is 245");
	}
}
public class Student {
   public static void main(String[] args) {
	   System.out.println("----Student Information is----");
	   rollNo rn=new rollNo();
	   rn.name();
	   studClass cls=new studClass();
	   cls.classNm();
	   rn.roll();
   }
}
