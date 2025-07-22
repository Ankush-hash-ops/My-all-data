package Handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_popups_program1 {
	public static void main(String[] args) throws InterruptedException {
		
//		<--------------demowebshop--------------------------------------->
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
		driver.get("https://demowebshop.tricentis.com/");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   Thread.sleep(2000);
	   driver.switchTo().alert().accept();
	   
	   
	   
//	   <-----------------rediff---------------------------------------------->
		
//		driver.get("https://money.rediff.com/index.html");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.switchTo().alert().accept();
		
		
			
		
	   
	   
	}

}
