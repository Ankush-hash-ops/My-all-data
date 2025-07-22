package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public String getDataFromprop(String key) throws IOException {

		FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Desktop\\java_ws\\CRM_application_vtiger_framework\\src\\test\\resources\\commonData.properties");
		 Properties pro=new Properties();
		 pro.load(fis);
		String value= pro.getProperty(key);
		 return value;
	}
	
	public String getDataFromExcel(String Sheet1,int RowNum,int CellNum ) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\HP\\Desktop\\sample_sel.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(RowNum);
		Cell cell = rw.getCell(CellNum);
		String name= cell.getStringCellValue();
		return name;
	}

}
