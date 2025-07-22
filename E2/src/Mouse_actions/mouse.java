package Mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://www.flipkart.com/");
		Actions action = new Actions(driver);
//		WebElement lg = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
//		<----------1) moveToElement-------------->
//		
//		action.moveToElement(lg).build().perform();
//		
//		<----------2) contextClick()--------------------->
//		
//		action.contextClick().build().perform();

//        <----------3) doubleClick----------------->
//		driver.get("http://demoapp.skillrary.com/product.php");
//		WebElement plus=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
//		action.doubleClick(plus).build().perform();

//	    <-----------4)clickAndHold---------------->
//		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
//		driver.findElement(By.id("password")).sendKeys("Ankushhh");
//		WebElement eye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
//
//		action.clickAndHold(eye).build().perform();

//		<------------5)dragAndDrop------------------>
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		WebElement italy = driver.findElement(By.id("box106"));
//		WebElement rome = driver.findElement(By.id("box6"));
////		
//		action.dragAndDrop(rome, italy).build().perform();
		
		WebElement spain=driver.findElement(By.id("box107"));
		WebElement madrid=driver.findElement(By.id("box7"));
		
		action.dragAndDrop(madrid, spain).build().perform();
		
//		<------------6)scrollToElement-------------->
//		driver.get("https://www.facebook.com/");
//		WebElement srll=driver.findElement(By.linkText("Services"));
//		action.scrollToElement(srll).build().perform();
		
////		<-------------7)scrollByAmount-------------->
//		driver.get("https://www.facebook.com/");
//		action.scrollByAmount(0,500).build().perform();
		
		
		

	}

}
