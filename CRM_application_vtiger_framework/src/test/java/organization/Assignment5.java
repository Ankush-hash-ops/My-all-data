package organization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.contactPage;
import object_repository.loginPage;

public class Assignment5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/");
		loginPage lp = new loginPage(driver);
		lp.login();

//		FileUtility futil = new FileUtility();
//
//		String URL = futil.getDataFromprop("url");
//		String username = futil.getDataFromprop("un");
//		String password = futil.getDataFromprop("pwd");
//		driver.get(URL);
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
//		driver.findElement(By.id("submitButton")).click();
		
//		driver.findElement(By.linkText("Contacts")).click();
		HomePage hp=new HomePage(driver);
		hp.getCreateContacts().click();
//		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		contactPage cp=new contactPage(driver);
		cp.getPlusIcon().click();
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\HP\\Desktop/sample_sel.xlsx");
//		Workbook wb = WorkbookFactory.create(fis1);
//		Sheet sh = wb.getSheet("Sheet1");
//		Row rw = sh.getRow(1);
//		Cell cell = rw.getCell(1);
//		String value = cell.getStringCellValue();
		FileUtility futil=new FileUtility();
	    String value1= futil.getDataFromExcel("Sheet1",1,1);
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(value);
	    cp.getLastName().sendKeys(value1);
	    cp.getSaveButton().click();
	    
//	   String statusBar= driver.findElement(By.xpath("//span[contains(text(),'Contact Information')]")).getText();
	    String statusBar=cp.getVerifyLastName().getText();
	   if(statusBar.contains(value1)) {
		   System.out.println("last name verfied");
	   }
	   else {
		   System.out.println("last name not verified");
	   }

}
}
