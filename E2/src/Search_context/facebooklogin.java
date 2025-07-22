package Search_context;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Ankush");
//		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Ankush@2002");
//		driver.findElement(By.name("login")).click();
//		driver.findElement(By.linkText("Games")).click();
//		driver.navigate().back();
//		Thread.sleep(4000);
//		driver.findElement(By.linkText("Meta Store")).click();
//		driver.navigate().back();
//	    driver.findElement(By.partialLinkText("Voting")).click();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ankush");
//		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'?')]")).click();
//		driver.findElement(By.xpath("//a[contains(@title,'Learn how we collect, use and share information to support Facebook.')]")).click();
//		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
////////		
		/*css selector*/
		
		
//		driver.findElement(By.cssSelector("a[title='Check out Facebook games.']")).click();
//		
		
		
		
		
		
	}

}

