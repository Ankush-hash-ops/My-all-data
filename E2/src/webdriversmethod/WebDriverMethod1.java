package webdriversmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	    Thread.sleep(5000);
		driver.get("https://www.zomato.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		 String url=driver.getCurrentUrl();
		System.out.println(url);
//		String Pagesource=driver.getPageSource();
//		System.out.println(Pagesource);
		driver.close();
		driver.quit();
		
	}
}
