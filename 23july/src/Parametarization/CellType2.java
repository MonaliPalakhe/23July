package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
public class CellType2 {
   public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\dell\\Desktop\\JAVA\\websites.xlsx");
    Cell cellInfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1);
	  // System.out.println(CT);
	//cellType will boolean,string,Numeric
	   CellType CT = cellInfo.getCellType();  

    if(CT==CellType.STRING) 
    {
    	System.out.println(cellInfo.getStringCellValue());
    }
    else if(CT==CellType.BOOLEAN) 
    {
    	System.out.println(cellInfo.getBooleanCellValue());
    }
    else if(CT==CellType.NUMERIC) {
    	System.out.println(cellInfo.getNumericCellValue());
    }   
	   
	   
}
   
}
