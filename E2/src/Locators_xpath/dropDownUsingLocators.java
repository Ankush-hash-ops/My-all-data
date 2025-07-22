package Locators_xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropDownUsingLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demoqa.com/automation-practice-form");

		driver.findElement(By.id("firstName")).sendKeys("Ankush");
		driver.findElement(By.id("lastName")).sendKeys("Soni");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//option[text()='June']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Choose Monday, June 16th, 2025']")).click();
		

		Thread.sleep(2000);
		driver.quit();

	}

}
