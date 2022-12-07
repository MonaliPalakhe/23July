package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class messhoLogin {
	public static void main(String[] args) throws InterruptedException {
   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.meesho.com/auth?redirect=https%3A%2F%2Fwww.meesho.com%2F&source=profile&entry=header&screen=HP");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@ type='tel']")).sendKeys("9527138210");//automate mobile no.
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@ type='submit']")).click();//send otp for varify

	}
}