package webdriversmethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		 Options opt=driver.manage();
		 Window win=opt.window();
		 win.maximize();
		 win.minimize();
		 win.fullscreen();
		 
		
		 
		 
		 
		 
		 
		
		
		
	}
	

}
