package Keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.google.com/");
		WebElement tk=driver.findElement(By.id("APjFqb"));

		Actions action = new Actions(driver);
		action.sendKeys("selenium").build().perform();
		action.click(tk).build().perform();
		
//		action.keyDown(Keys.ARROW_DOWN).build().perform();
//		action.keyUp(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(1000);
//		
//		action.keyDown(Keys.ARROW_DOWN).build().perform();
//		action.keyUp(Keys.ARROW_DOWN).build().perform();0
//		Thread.sleep(1000);
//		
//		action.keyDown(Keys.ARROW_DOWN).build().perform();
//		action.keyUp(Keys.ARROW_DOWN).build().perform();
	  
		
		for(int i=1;i<=5;i++) {
			action.keyDown(Keys.ARROW_DOWN).build().perform();
        	action.keyUp(Keys.ARROW_DOWN).build().perform();
        	Thread.sleep(1000);
			
		}
		

	}
	
}
