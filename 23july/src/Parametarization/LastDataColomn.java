package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastDataColomn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file=new FileInputStream("C:\\Users\\dell\\Desktop\\JAVA\\TestingForParameterization.xlsx");  
		int data = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(data+1);
		
		
	}
	
}


