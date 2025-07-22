package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector_challenge {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/java_ws/E2/src/HTML/css_selector_challenge.html");
		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[class='abcs']")).sendKeys("Hello ankush");
		
		
//		<--------------------OR---------------->
		
		driver.findElement(By.className("abcs")).sendKeys("how are you");
	}
	

}
