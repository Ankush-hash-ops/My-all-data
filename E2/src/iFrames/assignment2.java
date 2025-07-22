package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame("send-sms-iframe");
		WebElement type=driver.findElement(By.xpath("//input[@type='email']"));
		type.click();
		type.sendKeys("9874563210");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("About Us")).click();
	}

}
