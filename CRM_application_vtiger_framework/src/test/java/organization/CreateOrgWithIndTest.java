package organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.organizationPage;

public class CreateOrgWithIndTest  extends BaseClass{
	@Test
	public void createOrgWithIndTest() throws EncryptedDocumentException, IOException, InterruptedException {
//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("http://localhost:8888/");
//		loginPage  lp=new loginPage(driver);
//		lp.login();
		 
		HomePage hp=new HomePage(driver);
		hp.getCreateOrganization().click();
		organizationPage op=new organizationPage(driver);
		op.getplusIcon().click();
		
		FileUtility futil=new FileUtility();
		String value=futil.getDataFromExcel("Sheet1", 1, 0)+(int)(Math.random()*1000);
		WebElement an=driver.findElement(By.xpath("//input[@name='accountname']"));
		an.sendKeys(value);
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
}
}
