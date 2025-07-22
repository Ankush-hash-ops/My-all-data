package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_login {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	
		driver.findElement(By.name("username")).sendKeys("Ankush");
		driver.findElement(By.name("password")).sendKeys("2002");
		driver.findElement(By.xpath("//button[contains(@class,'_acap')]")).click();
		
		
		
		
	}

}
