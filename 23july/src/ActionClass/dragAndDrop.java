package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		  Thread.sleep(2000);
		  WebElement frame = driver.findElement(By.xpath("(//iframe[contains(@class,'demo-')])[1]"));
		  driver.switchTo().frame(frame);
		  WebElement source = driver.findElement(By.xpath("//img[contains(@alt,'peaks of High')]"));
		 WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		 WebElement source1 = driver.findElement(By.xpath("//img[contains(@alt,'Green mountain')]"));
		 
		 Actions a=new Actions(driver);
		 a.dragAndDrop(source, dest).perform();
		 Thread.sleep(2000);
		 Actions a1=new Actions(driver);
		// a1.dragAndDrop(source1, dest);
		 a1.moveToElement(source1).clickAndHold().moveToElement(dest).release().build().perform();
}
}