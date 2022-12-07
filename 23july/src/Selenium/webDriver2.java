package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");//launch URL and navigate URL
	Thread.sleep(3000);//wait for 3 sec.
  // driver.close();//use for single tab closing 
	//driver.quit();//whole browser close
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facebook.com/r.php");
	driver.close();
	Thread.sleep(3000);
	

 
}

}
