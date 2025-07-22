package generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	WebDriver driver;
	Actions act;

	public WebDriverUtility(WebDriver driver) {

		this.driver = driver;
		act = new Actions(driver);
	}

	public void Select(WebElement WebElement) {
		Select sel = new Select(WebElement);
		return;

	}

}
