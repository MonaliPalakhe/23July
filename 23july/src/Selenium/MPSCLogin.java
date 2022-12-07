package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MPSCLogin {
public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://mpsconline.gov.in/candidate/login");
	 Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("manasisutar2210@gmail.com");
     Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("monali@1022");
	      Thread.sleep(1000);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(1000);
}
}
