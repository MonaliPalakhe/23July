package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://skpatro.github.io/demo/links/");
	  driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	  
	  Set<String> ids = driver.getWindowHandles();
	  
	  ArrayList<String> alt=new ArrayList<String>(ids);
	  
	  String ch = alt.get(1);//get child window address
	  
	  driver.switchTo().window(ch);//focus on child window 
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	  
	  driver.switchTo().window(alt.get(0));
	  
	  driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	  
	  
	  
	
	
}
}