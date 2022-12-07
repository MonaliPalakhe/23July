package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MPHLogin {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.mehtapublishinghouse.com/login.aspx");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("manasisutar2210@gmail.com");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mypass@123");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
}
}