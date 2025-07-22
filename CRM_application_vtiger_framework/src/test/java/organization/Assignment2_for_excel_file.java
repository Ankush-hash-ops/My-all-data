package organization;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_utility.FileUtility;

public class Assignment2_for_excel_file {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		
//		FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Desktop\\java_ws\\CRM_application_vtiger_framework\\src\\test\\resources\\commonData.properties");
//		 Properties pro=new Properties();
//		 pro.load(fis);
//		String URL= pro.getProperty("url");
//		String username=pro.getProperty("un");
//		String password=pro.getProperty("pwd");
		
		  
		FileUtility futil=new FileUtility();
		
		String URL=futil.getDataFromprop("url");
		String username=futil.getDataFromprop("un");
		String password=futil.getDataFromprop("pwd");
		
		
		driver.get(URL);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

//		FileInputStream fis1 = new FileInputStream("C:\\Users\\HP\\Desktop/sample_sel.xlsx");
//		Workbook wb = WorkbookFactory.create(fis1);
//		Sheet sh = wb.getSheet("Sheet1");
//		Row rw = sh.getRow(1);
//		Cell cell = rw.getCell(1);
//		String value = cell.getStringCellValue();
		
	   String value= futil.getDataFromExcel("Sheet1",1,1);
		
//		System.out.println(value);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(value);
		driver.findElement(By.xpath("//img[contains(@onclick,'Popup&popuptype')]")).click();

		String sid = driver.getWindowHandle();
		Set<String> st = driver.getWindowHandles();
		
		st.remove(sid);
		for (String gt : st) {
			driver.switchTo().window(gt);
		}
         String value1=futil.getDataFromExcel("sheet1", 1, 0);
        
//		Cell tw = rw.getCell(0);
//		String value1 = tw.getStringCellValue();
		driver.findElement(By.id("search_txt")).sendKeys(value1);

        driver.findElement(By.id("11")).click();
        driver.switchTo().window(sid);
        driver.findElement(By.xpath("//input[@accesskey='X']/../input")).click();
        
	}

}
