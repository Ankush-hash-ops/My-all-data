package Handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_popups_program2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("sdfer345");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().accept();
		

	}
}
