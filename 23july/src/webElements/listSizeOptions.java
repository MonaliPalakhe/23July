package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class listSizeOptions {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/r.php");
		  
		  WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
			 Select ele=new Select(year);
			List<WebElement> options = ele.getOptions();
			int size=options.size();
			
			System.out.println("List size is :" +size );
              for(int i=0;i<=options.size()-1;i++) {
            	  System.out.println(options.get(i).getText());
              }
			
	}
}
