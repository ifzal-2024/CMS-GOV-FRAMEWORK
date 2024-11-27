package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.CommonActions;

import static common.CommonActions.*;

import java.time.Duration;
import java.util.Set;

import javax.xml.xpath.XPath;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']")
	WebElement logo;

	// 1st way: Most common way to write the WebElement (@FindBy),
	// you must know how to do that, 98% cases, this is used
	// Use of unique 'Id' attribute as locator
	// @FindBy(id = "cms-forgot-userid")
	// WebElement forgotUserId;

	// Use of unique 'name' attribute as locator
	@FindBy(name = "user-d")
	WebElement userId;

	// 2nd way to create a WebElement: not common, here I used for the 'password'
	// Just to make you guys familiar, if you see in your job
	@FindBy(how = How.NAME, using = "pass-d")
	WebElement password;

	// Use of unique 'class' attribute as locator
	// FYI: Never take a class value as unique if they have white space between
	// words.
	// Example: class value of logo, this is unique, but a compound class -->
	// "cms-icon cms-sprite-loggedout ms-3"
	@FindBy(className = "cms-newuser-reg")
	// @FindBy(xpath = "//a[@id='cms-newuser-reg' and @class='cms-newuser-reg']")
	// @FindBy(xpath = "//a[text()='New User Registration']")
	WebElement newUserRegistration;

	// 3rd way to create a WebElement with "By" Class:
	// Not common, here I used "unlock" web element from the home page
	// instead of xpath, we can use id, name, class etc as locator.
	// By unlock = By.id("cms-unlock-account");
	By unlock = By.xpath("//a[@id='cms-unlock-account']");

	@FindBy(xpath = "//label[@id='cms-label-tc']")
	WebElement termsAndCondition;

	// @FindBy(xpath ="//button[text()='Login' and @id='cms-login-submit']" )
	// WebElement loginButton;
	// We Changed from text and id to just id

	@FindBy(id = "cms-login-submit")
	WebElement loginButton;

	// Using text and another attribute
	// @FindBy(xpath = "//button[text()='Login' and @id='cms-login-submit' ]")
	// WebElement loginButton;

	// The text which is linked to an external source is LinkText
	// Use of 'linkText' attribute as locator
	@FindBy(linkText = "User ID")
	WebElement forgotUserId;

	// Use of 'partialLinkText' attribute as locator
	@FindBy(partialLinkText = "Passwor")
	WebElement forgotPassword;

	// Web Element: New User Registration Button, cssSelector as locator using class
	// value
	@FindBy(css = "a.cms-newuser-reg")
	WebElement nurCSS;

	// Web Element: Login Button, cssSelector as locator using id value
	@FindBy(css = "button#cms-login-submit")
	WebElement loginCSS;

	// Use of 'tagName' attribute as locator
	// @FindBy(tagName = "header")
	@FindBy(tagName = "header")
	WebElement headerTag;

	// For is isDisplayed()
	@FindBy(css = "em.cms-icon.cms-sprite-loggedout.ms-3")
	WebElement logoCSS;
	
	@FindBy(xpath = "//span[text()='Help']")
	WebElement help;

	@FindBy(xpath = "//h1[text()='CMS Enterprise Portal - Help Center']")
	WebElement helpPageHeader;
	
	public void clickLogo() {
		// common method 'clickElement()' is not used here
		logo.click();
	}

	public void clickLoginButton() throws InterruptedException {
		// common method 'pause()' is not used here
		Thread.sleep(4000); // Before clicking
		// common method 'clickElement()' is not used here
		loginButton.click();
		// common method 'pause()' is not used here
		Thread.sleep(4000); // After clicking
	}

	// We used try-catch block to handle exception in this method
	public void clickUserId() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// common method 'clickElement()' is used from here
		clickElement(userId);
		// common method pause is used here
		pause(3000);
	}

	public void clickPassword() {
		password.click();
		pause(3000);
	}

	public void clickNewUserRegistration() {
		pause(5000);
		newUserRegistration.click();
		pause(5000);
	}

	// Not common, just for your reference
	public void clickUnlock() throws InterruptedException {
		driver.findElement(unlock).click();
		pause(5000);
	}

	// We are using sendKeys() method to input the text in userId field
	public void inputTextInUserIdField() {
		pause(3000);
		userId.sendKeys("August 2024 QA");
		pause(3000);
	}

	// We are using 3 common actions here -- click(), pause(), inputText()
	public void inputTextInUserIdAndPasswordFieldThenClickIAgreeAndFinallyToTheLoginButton() {
		pause(3000);
		inputText(userId, "OnthrallTest@1234");
		inputText(password, "inthrallTest@1234");
		pause(3000);
		clickElement(termsAndCondition);
		pause(3000);
		clickElement(loginButton);
		pause(3000);
	}

	// Alternate of above method {Raw Code, some people like to use this way}
	// We can use a web element directly in the method, that is also common
	// we don't need to create "webElement" and "common method"
	public void useOfByClassInLoginProcess() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("user-d")).sendKeys("enthrall_1234");
		driver.findElement(By.name("pass-d")).sendKeys("OnthrallTest@1234");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@id='cms-label-tc']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text() = 'Login' and @id='cms-login-submit']")).click();
		Thread.sleep(4000);
	}

	// Important: Use of linkText as locator
	// Web Element: forgot userId
	public void use_of_linkText_as_locator_in_forgot_userId_hyperlink() {
		pause(3000);
		clickElement(forgotUserId);
		pause(3000);
	}

	// Important: Use of partial linkText as locator
	// Web Element: forgot password
	public void use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink() {
		pause(3000);
		clickElement(forgotPassword);
		pause(4000);
	}

	// Web Element: Logo
	// logo: class attribute value: cms-icon cms-sprite-loggedout ms-3
	// Exception 'InvalidSelectorException': 'Compound class names not permitted',
	// so even if you see class value is unique but separated by space,
	// avoid this as a class name locator, rather use css selector
	// This scenario will show error and will failed everywhere
	public void why_we_use_cssSelector_as_locator_in_logo() {
		driver.findElement(By.className("cms-icon cms-sprite-loggedout ms-3")).click();
	}

	// Web Element: New User Registration Button
	// Important: Use of cssSelector as locator
	// cssSelector is very important for interview
	// cssSelector by class --> inside the string, first put html tag, then dot,
	// then write value of the class attribute
	public void role1a_use_of_cssSelector_by_class_name_value() {
		pause(10000);
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();
		;
		pause(10000);
	}

	public void role1b_use_of_cssSelector_by_class_name_value() {
		pause(10000);
		clickElement(nurCSS);
		pause(10000);
	}

	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// if you wanna create cssSelector by id
	// first html tag, then # (hash), then write the value of id attribute inside
	// the string
	public void role2a_use_of_cssSelector_by_id_value() {
		driver.findElement(By.cssSelector("button#cms-login-submit")).click();
		pause(3000);
	}

	public void role2b_use_of_cssSelector_by_id_value() {
		clickElement(loginCSS);
		pause(3000);
	}

	// Web Element: logo
	// Important: Use of cssSelector as locator
	// if the class (compound class) contain separate words [cms-icon
	// cms-sprite-loggedout ms-3],
	// they are actually different class, then
	// we have to close the gap between classes by putting the dot/period
	// cssSelector by class --> htmltag.class name value
	// remove the space between words in class value, and replace with dot/period
	public void role3_use_of_cssSelector_by_compund_class_name_value() {
		driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.ms-3")).click();
	}

	// Use of cssSelector as locator
	// Web Element: login Button
	// high level, you can ignore
	// cssSelector by another attribute
	// --> htmltag[id/class/name attribute = 'value of the attribute' ] , in xpath -
	// you use // and @, which is absent here
	// and you can use any other attribute name except id and class
	public void role4_use_of_cssSelector_by_attribute_and_its_value() {
		driver.findElement(By.cssSelector("button[name='Submit Login']")).click();
		pause(3000);
	}

	// Web Element: NUR Button
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag.value of class[other attribute name = 'value of the attribute'] ,
	// you can use attribute except id and class
	// That's why we use title
	public void role5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_value() {
		driver.findElement(By.cssSelector("a.cms-newuser-reg[title='New User Registration']")).click();
		pause(3000);
	}

	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag#value of ID[other attribute name='value of attribute '] , you can
	// use attribute except id and class
	// That's why we use title
	public void role6_use_of_cssSelector_by_id_value_and_attribute_and_its_value() {
		driver.findElement(By.cssSelector("button#cms-login-submit[title='Login']")).click();
		pause(3000);
	}

	// Important: Use of tagName as locator
	// tag name: we have to go to Amazon and find "table" tag, which is unique

	// in cms portal not a single tag except header
	public void use_of_tagName_as_locator() {
		clickElement(headerTag);
	}

	// Web Element: logo
	// isDisplayed() method is boolean type, outcome: true or false
	// isDisplayed() is the method used to verify the presence of a web element
	// within the web page.
	// Use of isDisplayed() available in --> image, link, button, text field, check
	// box etc.
	public void use_of_isDisplayed_01() {
		boolean elementDisplayed = driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.ms-3"))
				.isDisplayed();
		System.out.println("Is the Logo displayed? Ans: " + elementDisplayed);
	}

	public void use_of_isDisplayed_02() {
		logoCSS.isDisplayed();
		System.out.println(logoCSS.isDisplayed()); // We can use this way but not suggested, Give a name instead.
		boolean isDiplayed2 = logoCSS.isDisplayed();
		System.out.println(isDiplayed2);

	}

	// use of isDisplayed method inside our common actions --> elementDisplayed()
	// Use of isDisplayed() available in --> image, link, button, text field, check
	// box etc.
	public void use_of_isDisplayed_in_login() {
		pause(3000);
		elementDisplayed(userId);
		inputText(userId, "enthrall_123");
		pause(3000);
		elementDisplayed(password);
		inputText(password, "OnthrallTest@12345");
		pause(3000);
		clickElement(termsAndCondition);
		pause(3000);
		clickElement(loginButton);
		pause(3000);
	}

	// Web Element: checkbox
	// isSelected() Used with radio buttons, dropdowns and checkboxes.
	// use of isSelected() method inside
	// TODO: Why showing false for isSelected?
	public void use_of_isSelected_in_login() {
		pause(3000);
		elementDisplayed(userId);
		inputText(userId, "enthrall_123");
		pause(3000);
		elementDisplayed(password);
		inputText(password, "OnthrallTest@12345");
		pause(3000);
		elementSelected(termsAndCondition);
		clickElement(termsAndCondition);
		pause(3000);
		clickElement(loginButton);
		pause(3000);
	}

	// Web Element: login Button
	// isEnabled() is the method used to verify if the web element is enabled or
	// disabled within the web page. isEnabled() is primarily used with "buttons".
	// Use of isEnabled(), a boolean type method
	// use of isEnabled method inside elementEnabled()
	public void use_of_isEnabled_in_login() {
		pause(3000);
		elementDisplayed(userId);
		inputText(userId, "enthrall_123");
		pause(3000);
		elementDisplayed(password);
		inputText(password, "OnthrallTest@12345");
		pause(3000);
		clickElement(termsAndCondition);
		pause(3000);
		elementSelected(termsAndCondition);
		pause(3000);
		elementEnabled(loginButton);
		clickElement(loginButton);
		pause(3000);
	}

	// In real time scenario we do below test at the beginning of a page,
	// but by using common action, not by following below codes
	public void getMethodsOfThePage() {
		elementDisplayed(logo);
		String actual = driver.getTitle();
		System.out.println("Title of the Page is: " + actual); // this line is not necessary
		String expected = "CMS Enterprise Portal";
		Assert.assertEquals(actual, expected, "Title Does not Match");

		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		String expectedURL = "https://portal.cms.gov/portal/";
		Assert.assertEquals(currentURL, expectedURL, "The driver failed to direct at right URL");

		// use of getText() in "login button"
		String actualTextPresntInTheWebElement = loginButton.getText();
		System.out.println("Text Present as: " + actualTextPresntInTheWebElement);
		String expectedTextPresntInTheWebElement = "Login";
		Assert.assertEquals(actualTextPresntInTheWebElement, expectedTextPresntInTheWebElement,
				"The text present in the WebElement doesn't match");

	}

	// This is the first method used during automation framework
	// what is title?
	// what is the url?
	// is logo displayed?
	// here, method coming from common action
	public void newUserRegistrationPageValidation() {
		elementDisplayed(logo);
		verifyTitle(driver, "CMS Enterprise Portal");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/");
		elementEnabled(newUserRegistration);
		verifyTextOfTheWebElement(newUserRegistration, "New User Registration");
		clickElement(newUserRegistration);
		pause(5000);
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
	}

	// Here We used User ID field
	// getAttribute() method actually give us, the value of the Attribute,
	// raw use, in next method we will use from common action
	public void use_of_getAttribute_method() {
		elementDisplayed(userId);
		pause(3000);
		String ml = userId.getAttribute("maxlength");
		System.out.println("The value of the maxlength attribute is: " + ml);
		// another example
		String ph = userId.getAttribute("placeholder");
		System.out.println("The value of the placeholder attribute is: " + ph);
	}

	
	// use of clear()
		public void use_of_clear_in_login() {
			pause(3000);
			elementDisplayed(userId);
			inputText(userId, "August 2024");
			pause(3000);
			clearTextFromTheField(userId);
			pause(3000);
			inputText(userId, "enthrall");
			pause(3000);
			elementDisplayed(password);
			inputText(password, "Abul Biri");
			pause(3000);
			clearTextFromTheField(password);
			pause(3000);
			inputText(password, "OnthrallTest");
			pause(3000);
			clickElement(termsAndCondition);
			pause(3000);
			elementSelected(termsAndCondition);
			pause(3000);
			elementEnabled(loginButton);
			verifyTextOfTheWebElement(loginButton, "Login"); // new
			clickElement(loginButton);
			pause(3000);
		}
		
		
		
		// use of navigate()
		// mostly important interview question, never used in framework or in real time environment
		public void use_of_navigate_method () {
			pause(3000);
			driver.navigate().to("https://www.mountsinai.org/");
			pause(3000);
			driver.navigate().back();
			pause(3000);
			driver.navigate().forward();
			pause(3000);
			driver.navigate().refresh();
			pause(3000);
		}
		
		
		// Very very important interview question
		public void use_of_mouse_hoverAction_on_ourLocations () {
			pause(3000);
			// below process we don't use in framework
			driver.navigate().to("https://www.mountsinai.org/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(ourLocations).build().perform();
			pause(3000);
			// Then click on Mount Sinai Hospital from the list
			// new way to create xpath by parent [practice it]
			driver.findElement(By.xpath("//a[text()='The Mount Sinai Hospital']//parent::li[@class='notranslate']")).click();
		verifyCurrentUrl(driver, "https://www.mountsinai.org/locations/mount-sinai");
						
			
		}
		
		public void switch_between_window() {
			elementDisplayed(help);
			clickElement(help); // a child window will open
			// getWindowHandle() method handle only one window [parent]
			// getWindowHandles() method handle more than one window
			Set<String> allWindowHandles = driver.getWindowHandles(); 
			// Extract Parent and child window from all window handles
			String parent = (String)allWindowHandles.toArray()[0];
			String child = (String)allWindowHandles.toArray()[1];
			driver.switchTo().window(child);
			verifyTextOfTheWebElement(helpPageHeader, "CMS Enterprise Portal - Help Center");
			pause(3000);
			
			
			}
		
		
		
		// Drop down discussed in Forgot User Id Page
		
		// use of Keys.ENTER, raw code here.
		public void use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_01 () {
			pause(3000);
			driver.findElement(By.id("cms-login-userId")).sendKeys("August 2024",Keys.ENTER);
			pause(3000);
		}
		

		// use of Keys.ENTER, common method inputTextThenClickEnter() used here
		public void use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_02 () {
			pause(3000);
			elementDisplayed(userId);
			inputTextThenClickEnter(userId, "August 2024 QA");
			pause(3000);
		}
		
		
		// use of Keys.RETURN , common method used
		public void use_of_sendKeys_method_then_click_by_return_key_of_the_laptop () {
			elementDisplayed(userId);
			inputTextThenClickEnter(userId, "enthrall_12");
			pause(4000);
			elementDisplayed(password);
			inputTextThenClickReturn(password, "OnthrallTest@123"); // Return Key Used here
			pause(4000);
		}
		
		// use of Keys.TAB, common method used
		public void use_of_sendKeys_method_then_click_by_tab_key_of_the_laptop () {
			elementDisplayed(userId);
			inputTextThenClickTab(userId, "enthrall_12");  // the focus will go to next input "Password" field
			pause(4000);
		}
			
		
		
		
}
