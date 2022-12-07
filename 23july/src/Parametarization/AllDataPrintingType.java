package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.CellType;
public class AllDataPrintingType {
     public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\dell\\Desktop\\JAVA\\websites.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int i=0;i<=sh.getLastRowNum();i++) 
		{ 
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++)
			{
				CellType CT=sh.getRow(i).getCell(j).getCellType();
				if(CT==CellType.STRING) {
				String data=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data  +  "    ");
				}
				else if(CT==CellType.BOOLEAN) 
				{
					boolean data=sh.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(data  +  "    ");
				}
				else if(CT==CellType.NUMERIC) 
				{
					 double data = sh.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(data  +  "    ");
				}		
				
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	
}
