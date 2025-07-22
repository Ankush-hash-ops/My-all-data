package organization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.contactPage;
import object_repository.loginPage;
import object_repository.logoutPage;

public class Assignment4 {
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
		HomePage hp = new HomePage(driver);
		hp.getCreateContacts().click();
//		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		contactPage cp = new contactPage(driver);
		cp.getPlusIcon().click();

		FileInputStream fis1 = new FileInputStream("C:\\Users\\HP\\Desktop/sample_sel.xlsx");
//		Workbook wb = WorkbookFactory.create(fis1);
//		Sheet sh = wb.getSheet("Sheet1");
//		Row rw = sh.getRow(1);
//		Cell cell = rw.getCell(1);
//		String value = cell.getStringCellValue();
		FileUtility futil = new FileUtility();
		String value1 = futil.getDataFromExcel("Sheet1", 1, 1);
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(value);
		cp.getLastName().sendKeys(value1);
//		driver.findElement(By.xpath("//img[contains(@onclick,'Popup&popuptype')]")).click();
		cp.getAddOrganization().click();

		String sid = driver.getWindowHandle();
		Set<String> st = driver.getWindowHandles();

		st.remove(sid);
		for (String gt : st) {
			driver.switchTo().window(gt);
		}
		String value2 = futil.getDataFromExcel("sheet1", 1, 0);


//		Cell tw = rw.getCell(0);
//		String value1 = tw.getStringCellValue();
//		driver.findElement(By.id("search_txt")).sendKeys(value2);
		cp.getSearchOrganization().sendKeys(value2);

//        driver.findElement(By.xpath("//input[@name='search']")).click();
		cp.getSearchNow().click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(value2)).click();
		driver.switchTo().window(sid);
//        driver.findElement(By.xpath("//input[@accesskey='X']")).click();

		cp.getSaveButton().click();
		  String lastNameTextfield=cp.getVerifyLastName().getText();
		  String orgTextfield=driver.findElement(By.id("mouseArea_Organization Name")).getText();
		   if(lastNameTextfield.contains(value1)) {
			   System.out.println("last name verfied");
		   }
		   else {
			   System.out.println("last name not verified");
		   }
		   if(orgTextfield.contains(value2)) {
			   System.out.println("organization name verified");
		   }
		   else {
			   System.out.println("organization name not verified");
		   }
		   
		   logoutPage lop=new logoutPage(driver);
		   lop.LogOut();


	}

}



