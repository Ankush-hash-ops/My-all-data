package organization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop/Book1.xlsx");
		
	    Workbook wb=	WorkbookFactory.create(fis);
	   Sheet shee= wb.getSheet("Sheet1");
	  Row rw= shee.getRow(0);
	   Cell cl=rw.getCell(1);
	  String value= cl.getStringCellValue();
	  
	  System.out.println(value);

		
	}

}
