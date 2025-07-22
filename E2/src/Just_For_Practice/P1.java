package Just_For_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.facebook.com/'");
		WebElement email=driver.findElement(By.id("email"));
//		email.sendKeys("hello");
		js.executeScript("arguments[0].value='hello'",email);
		
	}

}
