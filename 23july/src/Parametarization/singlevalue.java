package Parametarization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class singlevalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file=new FileInputStream("C:\\Users\\dell\\Desktop\\JAVA\\websites list.xlsx");  
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);
		
		
	}
	
}
