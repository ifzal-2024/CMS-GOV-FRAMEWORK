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
	
	
	@FindBy(name = "user-d")
	WebElement userId;
	
	// We used try-catch block to handle exception in this method
		public void clickUserId() {
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			userId.click();
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
}
