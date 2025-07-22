package Keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb"));
		
		Actions action=new Actions(driver);
		action.sendKeys("selenium").build().perform();
		action.keyDown(Keys.ENTER).build().perform();
		action.keyUp(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		
		driver.close();
	}

}
