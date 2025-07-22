package Handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javascript_popups_program3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult"); //
		driver.findElement(By.xpath("//button[text()='Try it']")).click(); 
		Actions action=new Actions(driver);
//		action.keyDown(Keys.BACK_SPACE).build().perform();
//		action.keyUp(Keys.BACK_SPACE).build().perform();
//		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Ankush");
		 String s=driver.switchTo().alert().getText();
		 System.out.println(s);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		

//		driver.close();
	}
}
