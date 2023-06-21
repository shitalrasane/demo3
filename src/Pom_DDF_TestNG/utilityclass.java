package Pom_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utilityclass 
{

	public static String utility(int RowInt,int cellInt) throws EncryptedDocumentException, IOException
	{

		FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("PB");
		String cell=sh.getRow(RowInt).getCell(cellInt).getStringCellValue();
		return cell;
	    
	}
	
	
	
}
