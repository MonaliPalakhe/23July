package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class rediffLogin {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manasisutar2210@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("monali@1022");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     Thread.sleep(1000);
		  
	}
}
