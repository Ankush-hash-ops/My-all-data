package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class delhi_metro {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://delhimetrorail.com/");
		driver.findElement(By.xpath("//button[@class='btn-close ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@ id='FromStation']")).click();
		driver.findElement(By.xpath("//div[text()='SHAHEED STHAL ( NEW BUS ADDA)']")).click();
		driver.findElement(By.xpath("//font[text()='MOHAN NAGAR']")).click();
		driver.findElement(By.xpath("//input[@id='ToStation']")).click();
		driver.findElement(By.xpath("//div[text()='NOIDA ELECTRONIC CITY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//font[text()='NOIDA SECTOR-16']")).click();
		driver.findElement(By.xpath("//span[text()='Now']")).click();
		driver.findElement(By.xpath("//label[@for='minimum-interchange']")).click();
		driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='circle-close-btn']/button")).click();
		driver.findElement(By.xpath("//li[text()='+']")).click();
		driver.findElement(By.xpath("//li[text()='+']")).click();
		
		
		
		
//		driver.close();
	}

}
