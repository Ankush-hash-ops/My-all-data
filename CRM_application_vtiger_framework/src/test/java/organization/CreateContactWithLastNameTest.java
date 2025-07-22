package organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.contactPage;

public class CreateContactWithLastNameTest extends BaseClass{
	@Test
	public void createContactWithLastName() throws EncryptedDocumentException, IOException {
//		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//			driver.get("http://localhost:8888/");
//			loginPage lp = new loginPage(driver);
//			lp.login();

			HomePage hp=new HomePage(driver);
			hp.getCreateContacts().click();
			contactPage cp=new contactPage(driver);
			cp.getPlusIcon().click();
			
			FileUtility futil=new FileUtility();
		    String value1= futil.getDataFromExcel("Sheet1",1,1);
		    cp.getLastName().sendKeys(value1);
		    cp.getSaveButton().click();
		    
		    String statusBar=cp.getVerifyLastName().getText();
		   if(statusBar.contains(value1)) {
			   System.out.println("last name verfied");
		   }
		   else {
			   System.out.println("last name not verified");
		   }

}
	}
