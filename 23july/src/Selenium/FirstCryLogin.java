package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FirstCryLogin {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.firstcry.com/m/login");
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9527138210");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='B14_white comm-btn btn-login-continue btn-login-cont-otp']")).click();
		  Thread.sleep(1000);
}        
}