package Popups;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.seleniumacademy.com/cookbook/Alerts.html");
		  driver.findElement(By.xpath("//button[@id='prompt']")).click();
		  Alert alt = driver.switchTo().alert();
		  Thread.sleep(3000);
		  alt.sendKeys("MonaliSutar");
		  alt.accept();
		 //  alt.dismiss();
		
		
		
		
	}
	
	
	
	
	
	
}
