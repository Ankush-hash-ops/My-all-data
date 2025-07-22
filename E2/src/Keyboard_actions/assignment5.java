package Keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class assignment5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("ankush@34");

		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).build().perform();
		action.sendKeys("a").build().perform();
		action.keyUp(Keys.CONTROL).build().perform();

		action.keyDown(Keys.CONTROL).build().perform();
		action.sendKeys("c").build().perform();
		action.keyUp(Keys.CONTROL).build().perform();

		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		
        Thread.sleep(2000);
        
		action.keyDown(Keys.CONTROL).build().perform();
		action.sendKeys("v").build().perform();
		action.keyUp(Keys.CONTROL).build().perform();

	}
}
