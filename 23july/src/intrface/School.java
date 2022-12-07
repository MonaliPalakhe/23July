package intrface;
public interface School {
	void fees();
	void syallabus();
	void exam();
}
class EighthClass implements School{
	public void fees() {
		System.out.println("Fees For Eighth class : 50K ");
	}
	public void syallabus() {
		System.out.println("Total Subjects : 6");
	}
	public void exam() {
		System.out.println("Final Exam Type is in School.");
	}
}
class NinthClass implements School{
	public void fees() {
		System.out.println("Fees For Eighth class : 60K ");
	}
	public void syallabus() {
		System.out.println("Total Subjects : 8");
	}
	public void exam() {
		System.out.println("Final Exam Type is in School.");
	}
}
class TenthClass implements School{
	public void fees() {
		System.out.println("Fees For Eighth class : 70K ");
	}
	public void syallabus() {
		System.out.println("Total Subjects : 10");
	}
	public void exam() {
		System.out.println("Final Exam type Board Exam.");
	}
}