package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ease_my_trip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //li[text()=' Round Trip ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ptt")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"a_Editbox13_show\"]")).sendKeys("Kolkata");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Kolkata(CCU)\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("img2Nex")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='trd_6_15/03/2025']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("img2Nex")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("img2Nex")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fst_1_02/06/2025")).click();
		driver.findElement(By.xpath("//button[@class='srchBtnSe']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
