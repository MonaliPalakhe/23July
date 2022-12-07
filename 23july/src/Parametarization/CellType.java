package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellType {
   public static org.apache.poi.ss.usermodel.CellType String;

public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\dell\\Desktop\\JAVA\\websites.xlsx");
	org.apache.poi.ss.usermodel.CellType CT = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(3).getCellType();
	   System.out.println(CT);
	   
}
   
}
