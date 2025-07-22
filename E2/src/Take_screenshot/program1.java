package Take_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class program1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.youtube.com/");
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\HP\\Desktop\\java_ws\\E2\\src\\screenshot/youtube.png");
		
		FileHandler.copy(src, dest);
		
		
		
		driver.get("https://www.amazon.com/");
	    File src1=ts.getScreenshotAs(OutputType.FILE);
	    File dest1=new File("./src\\screenshot/amazon.png");
	    FileHandler.copy(src1, dest1);
	
		
	}

}
