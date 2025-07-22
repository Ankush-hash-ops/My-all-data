package organization;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.contactPage;
import object_repository.logoutPage;

public class CreateContactWithOrgTest extends BaseClass {
	@Test
	public void createContactWithOrgTest() throws EncryptedDocumentException, IOException, InterruptedException {
////	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("http://localhost:8888/");
//		loginPage lp = new loginPage(driver);
//		lp.login();
		HomePage hp = new HomePage(driver);
		hp.getCreateContacts().click();

		contactPage cp = new contactPage(driver);
		cp.getPlusIcon().click();

		FileUtility futil = new FileUtility();
		String value1 = futil.getDataFromExcel("Sheet1", 1, 1);
		cp.getLastName().sendKeys(value1);
		cp.getAddOrganization().click();

		String sid = driver.getWindowHandle();
		Set<String> st = driver.getWindowHandles();

		st.remove(sid);
		for (String gt : st) {
			driver.switchTo().window(gt);
		}
		String value2 = futil.getDataFromExcel("sheet1", 1, 0);

		cp.getSearchOrganization().sendKeys(value2);
		cp.getSearchNow().click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(value2)).click();
		driver.switchTo().window(sid);

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
