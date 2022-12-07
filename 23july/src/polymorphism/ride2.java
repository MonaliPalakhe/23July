package polymorphism;

public class ride2 extends riding{
 public void Additon() {
	 System.out.println("Addition Ended.");
 }
 public static void main(String[] args) {
	riding r=new ride2();
	r.Addition();
}
}
