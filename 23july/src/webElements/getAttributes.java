package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class getAttributes {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/r.php");
		  Thread.sleep(1000);
	   WebElement result = driver.findElement(By.xpath("//input[@name='firstname']"));
	   
	     String att = result.getAttribute("type");
	     System.out.println(att);
	
	}
	
	
	
	
	
	
}
