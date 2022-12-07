package Inheritance;
class mens{
	public void store() {
	System.out.println("This is Mens Fashion Section.");
	}
	public void footware() {
		System.out.println("This is Mens footware Section.");
		}
}

class women extends mens{
	public void camp() {
		System.out.println("This Women's Fashion Section.");
	}
	public void ftware() {
		System.out.println("This womens footware section");
	}
}

public class amenora extends women {
 public static void main(String[] args) {
	 women wm=new women();
	 wm.store();
	 wm.footware();
	 wm.ftware();
	 wm.camp();
	 
	 
 }
	
	
}
