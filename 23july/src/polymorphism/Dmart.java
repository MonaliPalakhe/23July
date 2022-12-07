package polymorphism;
class grocery{
	public void total(float total) {
		System.out.println("Total Grocery Bill is : "+total);
	}
}
class dairyProduct extends grocery{
	public void total(float total) {
		System.out.println("Total DairyProduct Bill is : "+total);
	}
}
class stationaries extends dairyProduct{
	public void total(float total) {
		System.out.println("Total stationaries Bill is : "+total);
	}
}

public class Dmart {
	public static void main(String[] args) {
		grocery st=new stationaries();
		st.total(4000.00f);
		
	}
}
