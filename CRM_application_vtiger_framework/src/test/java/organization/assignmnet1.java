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

import object_repository.HomePage;
import object_repository.loginPage;
import object_repository.logoutPage;
import object_repository.organizationPage;

public class assignmnet1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
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
		
		FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Desktop/sample_sel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(1);
		Cell cell=rw.getCell(0);
		String value=cell.getStringCellValue();
		
//		System.out.println(value);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys((value)+(int)(Math.random()*1000));
//		op.getorgName((value)+(int)(Math.random()*1000));
//		driver.findElement(By.name("button")).click();
		op.getSaveButton().click();
//		WebElement bar=driver.findElement(By.xpath("//span[contains(text(),' Organization Information')]"));
		WebElement bar=op.getVerifyOrganization();
		String head=bar.getText();
		
		if(head.contains(value)) {
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
		logoutPage lop=new logoutPage(driver);
		
		

	}
}
