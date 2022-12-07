package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class UPSCLogin {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://upsconline.nic.in/ora/oraauth/candidate/LoginFinal.php");
		  Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("monali10");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("monali@1022");
	      Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       Thread.sleep(1000);
}
}
