package crm;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class try1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[@class='tabUnSelected'][3]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter organization name");
		String S=sc.next();
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(S);
		driver.findElement(By.name("button")).click();
		
		WebElement txt=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		String Ss=txt.getText();
		if(Ss.contains(S)) {
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
		
	
		
	}

}
