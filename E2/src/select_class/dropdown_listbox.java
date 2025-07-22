package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_listbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Ankush");
		driver.findElement(By.name("lastname")).sendKeys("Soni");
		
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select selDay=new Select(day);
		selDay.selectByIndex(3);
		
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select selMon=new Select(month);
		selMon.selectByValue("4");
		
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select selyear=new Select(year);
		selyear.selectByVisibleText("2018");
		Thread.sleep(2000);
		
//		boolean b1=selyear.isMultiple();
//		System.out.println(b1);
		
		
		
	
	
		
		Thread.sleep(3000);
		
	
		
		
//		driver.close();
	}

}
