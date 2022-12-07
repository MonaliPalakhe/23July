package polymorphism;

public class hide2 extends hiding {
	public static void Addition() {
		System.out.println("Addition Ended.");
	}
	public static void main(String[] args) {
		hide2.Addition();
		hiding.Addition();
	}

}
