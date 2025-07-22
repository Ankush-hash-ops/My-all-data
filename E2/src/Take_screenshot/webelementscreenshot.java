package Take_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webelementscreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		File src=driver.findElement(By.name("login")).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\HP\\Desktop\\java_ws\\E2\\src\\screenshot/login.png");
		FileHandler.copy(src, dest);
	}

}
