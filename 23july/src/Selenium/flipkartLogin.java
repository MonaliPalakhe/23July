package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class flipkartLogin {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.flipkart.com/account/login?ret=/");
  Thread.sleep(2000);
  
	
  
  driver.findElement(By.xpath("//input[@ class='_2IX_2- VJZDxU']")).sendKeys("9527138210");//Email or mobile automate
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("monali@1022");//password automate
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	//login successfully.....
}
}
