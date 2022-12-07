package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/w");//launch URL and navigate URL
		Thread.sleep(3000);//wait for 3 sec.
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manasisutar2210@gmail.com");//for Username
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("monty@1022");//for password
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@value='1']")).click();
	}
}