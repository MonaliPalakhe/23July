package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ajioLogin {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.ajio.com/");
		  Thread.sleep(1000);
	      driver.findElement(By.xpath("//span[@class='  login-form login-modal']")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@size='32']")).sendKeys("9527138210");
	      Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}