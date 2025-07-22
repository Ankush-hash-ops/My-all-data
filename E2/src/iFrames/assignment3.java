package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

	
		Actions action = new Actions(driver);
		
		
		driver.findElement(By.id("Accepted Elements")).click();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[contains(@data-src,'accepted')]"));
		driver.switchTo().frame(frame1);
		
		WebElement drag1 = driver.findElement(By.id("draggable"));
		WebElement drop1 = driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag1, drop1).build().perform();
//		driver.switchTo().fra

	}

}
