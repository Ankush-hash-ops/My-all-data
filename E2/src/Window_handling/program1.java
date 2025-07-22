package Window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
	
		
		
		driver.findElement(By.linkText("Meta Store")).click();
		driver.findElement(By.linkText("Meta Pay")).click();
		driver.findElement(By.linkText("Instagram")).click();
		
	    String parentId=driver.getWindowHandle();
		Set<String> ids=driver.getWindowHandles();
		
		for (String id : ids) {
			driver.switchTo().window(id);
			System.out.println(id);
			driver.close();
			Thread.sleep(3000);		
			}
	
		
		
		
		
		
	}

}
