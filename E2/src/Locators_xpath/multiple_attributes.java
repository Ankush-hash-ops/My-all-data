package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_attributes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy' and @placeholder='Email address or phone number']")).sendKeys("Ankush@2002");
		driver.findElement(By.xpath("//input[@name='passs' or @id='pass']")).sendKeys("Ankush@2002");
	}

}
