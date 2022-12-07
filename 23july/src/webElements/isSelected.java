package webElements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/r.php");
		  Thread.sleep(1000);
		 WebElement female = driver.findElement(By.xpath("//input[@class='_8esa']"));
		  female.click();
		  boolean fem = female.isSelected();
		  if(fem==true) {
			 System.out.println("Female is selected"); 
		  }
		  else {
			  System.out.println("Female is not selected");
		  }
}
}