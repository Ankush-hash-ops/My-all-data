package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user_name")
	private WebElement userEdit;

	public WebElement getUserEdit() {
		return userEdit;	
	}
	
	@FindBy(name="user_password")
	private WebElement passEdit;
	
	public WebElement getpassEdit(){
		return passEdit;
	}
	
	@FindBy(id="submitButton")
	private WebElement button;
	
	public WebElement getbutton() {
		return button;
	}
	public void login() {
		userEdit.sendKeys("admin");
		passEdit.sendKeys("admin");
		button.click();
	}
	

}
