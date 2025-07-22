package java_script_executer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.location='https://www.facebook.com/r.php?entry_point=login'");
//		WebElement name=driver.findElement(By.name("lastname"));
//		WebElement custom=driver.findElement(By.id("custom_gender"));
//		js.executeScript("arguments[0].value='hello'",custom);
		
//		
//		driver.get("https://www.facebook.com/");
//		
//		WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		js.executeScript("arguments[0].click()", forgot);
//		
//		WebElement search=driver.findElement(By.name("email"));
//		js.executeScript("arguments[0].value=arguments[2]", search, "987654321", "ankush@gmail.com");
		
		driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
		driver.findElement(By.linkText("jdk-23.0.2_doc-all.zip")).click();
		
		WebElement diabled=driver.findElement(By.linkText("Download jdk-23.0.2_doc-all.zip"));
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].click()", diabled);
	
	}

	}
	


