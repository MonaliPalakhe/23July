package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class rowPrint {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\dell\\Desktop\\JAVA\\websites.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		short rowsize = sh.getRow(1).getLastCellNum();
		    for(int i=0;i<=rowsize;i++) 
		    {
		    	String data=sh.getRow(1).getCell(i).getStringCellValue();
		    	System.out.print(data + " ");
		    	
		    }
		  
		
	}
	
	
	
	
}
