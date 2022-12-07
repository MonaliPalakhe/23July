package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAction {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
            Thread.sleep(2000);
           WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
           Actions a=new Actions(driver);
           a.moveToElement(login).perform();
           WebElement orders = driver.findElement(By.xpath("//div[text()='Orders']"));
          // a.click(orders).perform();
           a.contextClick(orders).perform();
           
	}
}