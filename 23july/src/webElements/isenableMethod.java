package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class isenableMethod {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/r.php");
		 boolean result= driver.findElement(By.xpath("//button[@name='websubmit']")).isEnabled();
		 System.out.println(result);
	//needs to validate element is enabled or not
		 if(result==true) 
		 {
			 System.out.println("Element is Enabled");
		 }
		 else
		 {
			 System.out.println("Element is disabled");
		 }
	
	
	}

}
