package Iframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableAutomate1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.w3schools.com/html/html_tables.asp");
		  List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));  
		  System.out.println(noOfRows.size());
		  
		   for(int i=1;i<noOfRows.size();i++) 
		   {
			   List<WebElement> noOfCell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			         System.out.print(noOfCell.size()+ " ");
			            for(int cell=0;cell<noOfCell.size();cell++) {
			            	System.out.print(noOfCell.get(cell).getText()+ " , ");
			            	
			            	
			            	
			            }
			            System.out.println();
			  
		   }
		    
		  
		  
}
}