package Web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vitger {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement element=driver.findElement(By.id("loginspan"));
		if(element.isDisplayed() || element.isEnabled()) {
			driver.findElement(By.id("loginspan")).click();
		}
		driver.findElement(By.name("username")).sendKeys("Raju12@gmail.com");
		driver.findElement(By.name("password")).sendKeys("raju@2001");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("iBabu6756@gmail.com");
		driver.findElement(By.name("password")).sendKeys("babu@5566");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
			
		
	
			
		
		
		
		
	}

}
