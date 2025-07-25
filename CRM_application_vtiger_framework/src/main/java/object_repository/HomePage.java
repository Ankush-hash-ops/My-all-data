package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Organizations")
	private WebElement CreateOrganization;
	
	public WebElement getCreateOrganization(){
	return CreateOrganization;
	}
	
	@FindBy(linkText = "Contacts")
	private WebElement CreateContacts;
	
	public WebElement getCreateContacts() {
		return CreateContacts;
	}

}
