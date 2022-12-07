package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class getText {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/signup");
		  Thread.sleep(1000);
	   WebElement result = driver.findElement(By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']"));
	   
	     String att = result.getText();
	     System.out.println(att);
	
	}
	
	
	
	
	
	
}


