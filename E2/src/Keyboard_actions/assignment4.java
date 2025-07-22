package Keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment4 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).click();
		
		Actions action=new Actions(driver);
		action.sendKeys("Ankush@5895").build().perform();
		action.keyDown(Keys.CONTROL).build().perform();
		action.sendKeys("a").build().perform();
		action.keyUp(Keys.CONTROL).build().perform();


		
	
		
		
		

}
}
