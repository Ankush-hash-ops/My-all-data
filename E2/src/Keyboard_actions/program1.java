package Keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.click();
//		search.sendKeys("iphone 16");
		
		Actions action=new Actions(driver);
		action.sendKeys("iphone16").build().perform();
		Thread.sleep(2000);
		
		action.keyDown(Keys.ENTER).build().perform();
		action.keyUp(Keys.ENTER).build().perform();
		
		
		
		
		
		
		driver.close();
		
	}

}
