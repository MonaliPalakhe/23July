package Selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;

public class WebDrivermethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Web driver methods.
		driver.get("https://www.facebook.com/r.php");//launch URL and navigate URL
		Thread.sleep(3000);//wait for 3 sec.
	  //  driver.close();//use for single tab closing 
		// driver.quit();//whole browser close
		String title=driver.getCurrentUrl();//get current url
		System.out.println(title);
		String e="https://www.facebook.com/r.php";
		if(title.equalsIgnoreCase(e)) 
		{
			System.out.println("Navigate to Correct Page");
		}
		else
		{
			System.out.println("Navigate to wrong page");
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();//above selenium 3 works
	}	
}
