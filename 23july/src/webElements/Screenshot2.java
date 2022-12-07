package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
public class Screenshot2 {
	
	public static void main(String[] args) throws InterruptedException, IOException{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.browserstack.com/guide/take-screenshots-in-selenium");
	  Thread.sleep(3000);
	 for(int i=5;i>0;i--) {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Date d=new Date();
	   String m = d.toString().replace(":", "_")+ ".png";
	  FileHandler.copy(src,new File("C:\\Users\\dell\\Downloads\\test"+m));
	}}
}
