package generic_utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import object_repository.loginPage;
import object_repository.logoutPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sdriver;
	FileUtility futil=new FileUtility();
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
	@BeforeSuite
	public void bsuite() {
		Reporter.log("DB connection, Report generation", true);
	}

	@BeforeTest
	public void btest() {
		Reporter.log("Pre condition", true);
	}
	
	 
	@BeforeClass
	public void bclass() throws IOException {
		Reporter.log("Opening browser", true);
		String BROWSER = futil.getDataFromprop("bro");
		
		String URL = futil.getDataFromprop("url");

		if (BROWSER.equalsIgnoreCase("chrome")) { 
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
	}

	@BeforeMethod
	public void bmethod() throws IOException {
		Reporter.log("Login", true);
		loginPage lp=new loginPage(driver);
		lp.login();
	}

	@AfterMethod
	public void amethod() throws InterruptedException {
		Reporter.log("Logout", true);
		logoutPage lop=new logoutPage(driver);
		lop.LogOut();
//		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign Out"))).click();
	}
	
	@AfterClass
	public void aclass() {
		Reporter.log("close browser", true);
		driver.quit();
	}
	
	@AfterTest
	public void atest() {
		Reporter.log("Post condition", true);
	}

	@AfterSuite
	public void asuite() {
		Reporter.log("DB close, Report backup", true);
	}
}
	

	

