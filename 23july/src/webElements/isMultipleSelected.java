package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class isMultipleSelected {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/r.php");
		  
		  WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
			 Select tel=new Select(year);
			 boolean result = tel.isMultiple();
			 System.out.println(result);
			 if(result==true) 
			 {
				 System.out.println("List box is Multiple selected.");
			 }
			 else
			 {
				 {
					 System.out.println("List box is not Multiple selected.");
				 }
			 }
		  
		  
}}
