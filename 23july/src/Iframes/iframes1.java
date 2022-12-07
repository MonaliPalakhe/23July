package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	  driver.switchTo().frame("iframeResult");
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
	  Thread.sleep(2000);
	  
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//button[@id='runbtn']")).click();
	  	  
	  
	  
}
}