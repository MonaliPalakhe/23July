package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.facebook.com/r.php");//launch URL and navigate URL
	
//	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.amazon.in");
	Thread.sleep(3000);
	driver.get("https://www.amazon.in/s/ref=nb_sb_noss?url=search-alias%3Dstripbooks&field-keywords=&crid=KI0CXGG8LKYM&sprefix=%2Cstripbooks%2C1499");
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
    Thread.sleep(3000);
}
}
