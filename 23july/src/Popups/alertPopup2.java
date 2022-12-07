package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup2 {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		  driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		  Alert alt = driver.switchTo().alert();
		  Thread.sleep(3000);
		  alt.sendKeys("MonaliSutar");
		  alt.accept();
		 //  alt.dismiss();
}}
