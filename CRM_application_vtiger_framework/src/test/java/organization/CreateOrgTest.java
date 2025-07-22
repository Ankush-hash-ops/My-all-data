package organization;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic_utility.BaseClass;
import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.organizationPage;

public class CreateOrgTest extends BaseClass{
	@Test
	public void createOrgTest() throws EncryptedDocumentException, IOException {
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/");
		loginPage  lp=new loginPage(driver);
		lp.login();*/
		HomePage hp=new HomePage(driver);
		hp.getCreateOrganization().click();
		organizationPage op=new organizationPage(driver);
		op.getplusIcon().click();
		
		
		FileUtility futil=new FileUtility();
		String value= futil.getDataFromExcel("sheet1", 1, 0);
	

		op.getOrgNameTextField().sendKeys((value)+(int)(Math.random()*1000));
		op.getSaveButton().click();
		WebElement bar=op.getVerifyOrganization();
		String head=bar.getText();
		
		Boolean sttus2=head.contains(value);
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(sttus2);
	
		System.out.println("verified successfully");
//		if(head.contains(value)) {
//			System.out.println("verified");
//			Reporter.log("Details verified");
//		}
//		else {
//			System.out.println("not verified");
//		}
		//logoutPage lop=new logoutPage(driver);
		//lop.LogOut();
		soft.assertAll();
		
		
		
		
		
		
		
	}

}
