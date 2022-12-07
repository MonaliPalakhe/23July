package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebpage1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
	  Thread.sleep(2000);	
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
       
       js.executeScript("window.scrollBy(0,2000)");//scroll down
       Thread.sleep(2000);
       js.executeScript("window.scrollBy(0,-2000)");//scroll up
       Thread.sleep(2000);

       WebElement Element = driver.findElement(By.linkText("VBScript"));

       //This will scroll the page Horizontally till the element is found		
       js.executeScript("arguments[0].scrollIntoView();", Element);
      
       

}

	
}
