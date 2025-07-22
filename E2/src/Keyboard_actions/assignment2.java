package Keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email"));
		
		Actions action=new Actions(driver);
		action.sendKeys("Ankush@87363").build().perform();
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();

		action.sendKeys("Ankush#456").build().perform();
		
		
		driver.close();
		
		
		
		
		
	}

}
