package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_web_shop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
    	WebElement ely=	driver.findElement(By.id("small-searchterms"));
		ely.sendKeys("computers");
		Thread.sleep(000);
		WebElement sel=driver.findElement(By.xpath("//label[text()='Very bad']/../input"));
		sel.click();
		if(sel.isSelected())
		{
			System.out.println("button is selected");
		}
		else
			System.out.println("Kuch select nahi hua");
		driver.findElement(By.id("vote-poll-1")).click();
	}

}
