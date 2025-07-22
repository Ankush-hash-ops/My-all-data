package java_script_executer;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
//		driver.get("https://en.wikipedia.org/wiki/Helen_Keller");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location='https://en.wikipedia.org/wiki/Helen_Keller'");
		
//		js.executeScript("window.scrollBy(0,1500)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1500)");
//		Thread.sleep(2000);
//
//		js.executeScript("window.scrollBy(0,1500)");
//		js.executeScript("window.scrollTo(0,5500");
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		

//		
		
	}

}
