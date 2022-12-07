package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/r.php");
		  //driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("monali");
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sutar");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9527138210");
		  driver.findElement(By.xpath("//input[contains(@id,'passwo')]")).sendKeys("my@password");
		//select value LISTbox actions
		  WebElement days=driver.findElement(By.xpath("//select[contains(@name,'bir')]"));
		 Select wel=new Select(days);
		 wel.selectByIndex(9);
		 WebElement mont=driver.findElement(By.xpath("//select[@title='Month']"));
		 Select ele=new Select(mont);
		//ele.selectByIndex(4);
		ele.selectByVisibleText("May");
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select tel=new Select(year);
		 tel.selectByIndex(30);
		 		 driver.findElement(By.xpath("//label[text()='Female']")).click();	 
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.quit();
	}
}
