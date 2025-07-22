package Keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.redbus.in/");
//		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='From']")));
		
		
		
		driver.findElement(By.xpath("//span[text()='Bus Tickets']")).click();
		
		WebElement typ= driver.findElement(By.id("src"));
		typ.sendKeys("Benglore");
	
		
		

//		
//	WebElement get=	driver.findElement(By.id("src"));
//	String value=get.getAttribute("class");
//	
//	System.out.println(value);
//		
//	get.click();
//	get.sendKeys("Benglore");
		
		
	
	}

}
