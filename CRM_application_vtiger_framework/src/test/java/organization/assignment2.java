package organization;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.loginPage;
import object_repository.organizationPage;

public class assignment2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/");
		loginPage  lp=new loginPage(driver);
		lp.login();
		
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
		
//		driver.findElement(By.xpath("//td[@class='tabUnSelected'][3]")).click();
//		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		 
		HomePage hp=new HomePage(driver);
		hp.getCreateOrganization().click();
		organizationPage op=new organizationPage(driver);
		op.getplusIcon().click();
		
//		FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Desktop/sample_sel.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sh=wb.getSheet("Sheet1");
//		Row rw=sh.getRow(1);
//		Cell cell=rw.getCell(0);
//		String value=cell.getStringCellValue();
		
		FileUtility futil=new FileUtility();
		String value=futil.getDataFromExcel("Sheet1", 1, 0)+(int)(Math.random()*1000);
		
//		System.out.println(value);
		WebElement an=driver.findElement(By.xpath("//input[@name='accountname']"));
		an.sendKeys(value);
		

//		WebElement drop = driver.findElement(By.xpath("//select[@name='industry']"));
	    WebElement drop=op.getIndustry();
		Select sel = new Select(drop);
		sel.selectByValue("Education");
//		driver.findElement(By.name("button")).click();
		op.getSaveButton().click();
		
		driver.navigate().back();
//		driver.findElement(By.linkText("Contacts")).click()
        hp.getCreateContacts().click();
//		driver.findElement(By.linkText("Organizations")).click();
		hp.getCreateOrganization().click();
//		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(value);
		op.getSearchBar().sendKeys(value);
//		WebElement tick = driver.findElement(By.id("bas_searchfield"));
		WebElement tick=op.getDropDownSearchField();
		
		Select sel1 = new Select(tick);
		sel1.selectByValue("accountname");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText(value)).click();

//		WebElement bar = driver.findElement(By.xpath("//span[contains(text(),'Organization Information')]"));
		WebElement bar=op.getVerifyOrganization();
		String header=bar.getText();
		
//		String industry=driver.findElement(By.xpath("//font[text()='Education']")).getText();
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



