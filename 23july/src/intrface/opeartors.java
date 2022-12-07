package intrface;
public interface opeartors {//super Interface with common and IMP properties.
 void data();
 void audiocalling();
 void massage();
}
 class jio implements opeartors{
	public void data() {
		System.out.println("2GB Per Day.");
	}
	public void audiocalling() {
		System.out.println("Unlimited AudioCalling per Month");
	}
	public void massage() {
		System.out.println("100 SMS per day");
		}
	public void primeMember() {//jio own Specification method
		System.out.println("100/- Off for Prime Member");
	}
}
 class VI implements opeartors {
	public void data() {
		System.out.println("1GB per day");
	}
	public void audiocalling() {
		System.out.println("0.25paise per sec.");
	}
	public void massage() {
		System.out.println("50 SMS per day.");
	}
	public void VIBank() {
		System.out.println("20% OFF On first Recharge");
	}
	
 }