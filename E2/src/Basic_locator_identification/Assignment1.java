package Basic_locator_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		
//		<---------------By Id------------------->
//		driver.findElement(By.id("u_0_5_Xi")).click();
		
		
		
//		<---------------By Name----------------->
//		driver.findElement(By.name("login")).click();
//		
		
		
//		<---------------by Class Name----------->
//		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();  Ivlid selector exception
		
//		<---------------By Tag Name--------------->
//		driver.findElement(By.tagName("button")).click();
		
//		<---------------Link Text----------------->
		driver.findElement(By.linkText("Log in")).click();
	}

}
