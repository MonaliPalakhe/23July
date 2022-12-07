package Inheritance;
class productName{//Hierarchical and MultiLevel Inheritance
	void name() {
		System.out.println("Product name is : DoveSoap");
	}
}
class productPrice{
	void price(){
		System.out.println("Product price is :60/- ");		
	}
}
 class quentity extends productPrice{
	 void quentity1() {
		 System.out.println("Total Quentity is : 20");
	 }
	 
 }
 class productDetails extends productName{
	 void details(){
		 System.out.println("Total Product Bill is : 60*20=1200");
	 }
 }
public class ProductBill {
	public static void main(String[] args) {
	productDetails pd=new productDetails();
	pd.name();
	pd.details();
	quentity qn=new quentity();
	qn.quentity1();
	qn.price();
	}
}
