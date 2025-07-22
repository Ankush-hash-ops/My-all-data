package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class make_my_trip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//li[text()='Round Trip']/span")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("//div[@role='combobox']/input")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//span[text()='Shirdi Airport']")).click();
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Wed Mar 05 2025']/div/p")).click();

		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon May 05 2025']/div/p")).click();
		driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
		driver.findElement(By.xpath("//li[@data-cy='children-2']")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
	
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		

	}

}
