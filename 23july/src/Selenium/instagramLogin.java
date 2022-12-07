package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class instagramLogin {

	public static void main(String[] args) throws InterruptedException {
		 // System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\geckodriver.exe");
		 // WebDriver driver=new ChromeDriver();
			  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.instagram.com/accounts/login/");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("manasisutar2210@gmail.com");//Username automate
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Monali@1022");//password automate
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@ type='submit']")).click();//button automate
		
}
}
