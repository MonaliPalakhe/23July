package webElements;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class InstaEnabled {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.instagram.com/accounts/login/");
		  Thread.sleep(1000);
		 boolean result= driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy   y3zKF')]")).isEnabled();
		 System.out.println(result);
	//needs to validate element is enabled or not
		 if(result==true) 
		 {
			 System.out.println("Element is Enabled");
		 }
		 else
		 {
			 System.out.println("Element is disabled");
		 }
	
	
	}

}

 


