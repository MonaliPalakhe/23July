package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
public class ScreenShotAutomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/?ref_=abn_logo");
		  Thread.sleep(3000);
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//TypeCasting Performed here
		  File destination=new File("C:\\Users\\dell\\Downloads\\Test02.jpeg");
	   //copy ScreenShot
		    FileHandler.copy(src, destination);
	}

}
