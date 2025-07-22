package javaScript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_Scrolling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://en.wikipedia.org/wiki/Helen_Keller");
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://en.wikipedia.org/wiki/Helen_Keller'");
//		js.executeScript("window.scrollBy(0,1330)");
		WebElement element=driver.findElement(By.xpath("//h2[text()='Later life and death']"));
		js.executeScript("arguments[0].scrollIntoView(false)",element);
//		WebElement input=driver.findElement(By.id("email"));
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ankush@2002");
//		js.executeScript("arguments[0].value='ankush'",input );
		
	}

}
