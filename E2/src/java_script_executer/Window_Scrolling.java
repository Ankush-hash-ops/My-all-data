package java_script_executer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Scrolling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.location='https://www.facebook.com/'");
	   WebElement dest=  driver.findElement(By.linkText("Privacy Centre"));
	    js.executeScript("arguments[0].scrollIntoView(false)",dest);
	   
//	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
