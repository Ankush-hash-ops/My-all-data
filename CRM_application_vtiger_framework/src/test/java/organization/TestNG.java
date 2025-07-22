package organization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.loginPage;
import object_repository.logoutPage;
import object_repository.organizationPage;

public class TestNG {
	@Test(groups = "Regression Test")
	public void createOrgTest() throws EncryptedDocumentException, IOException {
//		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://localhost:8888/");
			loginPage  lp=new loginPage(driver);
			lp.login();
			HomePage hp=new HomePage(driver);
			hp.getCreateOrganization().click();
			organizationPage op=new organizationPage(driver);
			op.getplusIcon().click();
			
			FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Desktop/sample_sel.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");
			Row rw=sh.getRow(1);
			Cell cell=rw.getCell(0);
			String value=cell.getStringCellValue();

			op.getOrgNameTextField().sendKeys((value)+(int)(Math.random()*1000));
			op.getSaveButton().click();
			WebElement bar=op.getVerifyOrganization();
			String head=bar.getText();
			
			if(head.contains(value)) {
				System.out.println("verified");
			}
			else {
				System.out.println("not verified");
			}
			logoutPage lop=new logoutPage(driver);
			lop.LogOut();	
		}
	@Test(groups = "Regression Test")
	public void createOrgWithPhoneTest() throws EncryptedDocumentException, IOException, InterruptedException {
//		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://localhost:8888/");
			loginPage  lp=new loginPage(driver);
			lp.login();
			
			HomePage hp=new HomePage(driver);
			hp.getCreateOrganization().click();
			organizationPage op=new organizationPage(driver);
			op.getplusIcon().click();
			
			FileUtility futil=new FileUtility();
			String value=futil.getDataFromExcel("Sheet1", 1, 0)+(int)(Math.random()*1000);
			
			op.getOrgNameTextField().sendKeys(value);
			
		    WebElement drop=op.getIndustry();
			Select sel = new Select(drop);
			sel.selectByValue("Education");

			String value2 = futil.getDataFromExcel("Sheet1", 1, 2);

			op.getPhoneTextField().sendKeys(value2);
			op.getSaveButton().click();
			Thread.sleep(2000);
			
			driver.navigate().back();

	        hp.getCreateContacts().click();

			hp.getCreateOrganization().click();

			op.getSearchBar().sendKeys(value);

			WebElement tick=op.getDropDownSearchField();
			
			Select sel1 = new Select(tick);
			sel1.selectByValue("accountname");
			Thread.sleep(2000);
			op.getSubmit().click();
			Thread.sleep(2000);
			driver.findElement(By.linkText(value)).click();


			String header=op.getVerifyOrganization().getText();
			
			String industry=op.getVerifyIndustry().getText();
			
			String phone=op.getVerifyPhone().getText();
			
	        if(header.contains(value)) {
	        	System.out.println(" organization name verified");
	        }
	        else {
	        	System.out.println("organization name not verified");
	        }
	        if(industry.contains("Education")) {
	        	System.out.println(" industry verified");
	        }
	        else {
	        	System.out.println("industry name not verified");
			
	        }
	        if(phone.contains(value2)) {
	        	System.out.println("phone no verified");
	        }
	        else {
	        	System.out.println("phone no not verified");
	        }
	        logoutPage lop=new logoutPage(driver);
			lop.LogOut();
	}
	@Test(groups = "Smoke Test")
	public void createOrgWithIndTest() throws EncryptedDocumentException, IOException, InterruptedException {
//		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://localhost:8888/");
			loginPage  lp=new loginPage(driver);
			lp.login();
			 
			HomePage hp=new HomePage(driver);
			hp.getCreateOrganization().click();
			organizationPage op=new organizationPage(driver);
			op.getplusIcon().click();
			
			FileUtility futil=new FileUtility();
			String value=futil.getDataFromExcel("Sheet1", 1, 0)+(int)(Math.random()*1000);
			
			op.getOrgNameTextField().sendKeys(value);
		    WebElement drop=op.getIndustry();
			Select sel = new Select(drop);
			sel.selectByValue("Education");

			op.getSaveButton().click();
			
			driver.navigate().back();

	        hp.getCreateContacts().click();
			hp.getCreateOrganization().click();
			op.getSearchBar().sendKeys(value);

			WebElement tick=op.getDropDownSearchField();
			
			Select sel1 = new Select(tick);
			sel1.selectByValue("accountname");
			Thread.sleep(2000);
			op.getSubmit().click();
			Thread.sleep(2000);
			driver.findElement(By.linkText(value)).click();


			WebElement bar=op.getVerifyOrganization();
			String header=bar.getText();
			;
			String industry=op.getVerifyIndustry().getText();
			
	        if(header.contains(value)) {
	        	System.out.println(" organization name verified");
	        }
	        else {
	        	System.out.println("organization name not verified");
	        }
	        if(industry.contains("Education")) {
	        	System.out.println(" industry verified");
	        }
	        else {
	        	System.out.println("industry name not verified");
			
	        }
	        logoutPage lop=new logoutPage(driver);
			lop.LogOut();
	}
}
