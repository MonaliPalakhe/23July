package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class uploadFile {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/dell/Desktop/JAVA/Java%20Programs/Selenium%20Programs/FileUpload.html");
		  Thread.sleep(1000);
	   WebElement result = driver.findElement(By.xpath("//input[@name='filename']"));
	   result.sendKeys("C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\Selenium Programs\\data.txt");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
          

	
	}
	
	
}
