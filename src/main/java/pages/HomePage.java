package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "cms-forgot-userid")
	WebElement forgotUserId;
	
	public void clickForgotUserId() throws InterruptedException {
		Thread.sleep(4000); // Before clicking
		forgotUserId.click();
		Thread.sleep(4000); // After clicking
	}
	
}
