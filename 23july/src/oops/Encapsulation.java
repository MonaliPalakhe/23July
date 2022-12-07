package oops;

public class Encapsulation {
 private int a;
 private int b;
  
 Encapsulation(){
	 a=30;
	 b=50;
 }
 Encapsulation(int c,int d){
	 a=c;
	 b=d;
 }
 public void test() {
	 int c=a+b;
	 System.out.println("Addition is : "+c);
 }
}
