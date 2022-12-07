package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class indiaTimesLogin {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.indiatimes.com/login");
		  Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9527138210");
	      Thread.sleep(1000);
	      
	}
}
