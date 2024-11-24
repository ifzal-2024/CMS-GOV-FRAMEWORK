package baseUtil;
//CMS Base Class
import java.time.Duration;

import javax.naming.ldap.Rdn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	
	public WebDriver driver;
	//public ChromeDriver driver; // Comment out Public WebDriver driver and run Test using this and check 
	//public FirefoxDriver driver;
	// public EdgeDriver driver;
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		//1st way
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifzal\\eclipse-workspace\\ifzal.gov.cms.portal.aug2024\\driver\\chromedriver.exe");
		
		//2nd way 
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		
		
		// 3rd and Final Way
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		// For Firefox Driver
		 //System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		//driver = new FirefoxDriver();
	
		// For Edge Driver
		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");		
		// driver = new EdgeDriver();
		
		//WebDriverManager.chromedriver().setup();
		//driver= new ChromeDriver();
		
		 //WebDriverManager.firefoxdriver().setup();
		 //driver = new FirefoxDriver();

		 //WebDriverManager.edgedriver().setup();
		 //driver = new EdgeDriver();

		// My Version = Version 131.0.6778.70
		// stable version: 131.0.6778.69
		// older version: 127.0.6533.72, 125.0.6422.78, 124.0.6422.78 [used here]
		// older version sometimes used for stability of browser, sometime the request from the Authority
		// if you choose version, then it will use that specific version of driver
		//WebDriverManager.chromedriver().driverVersion("124.0.6422.78").setup();
		 //driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
				
		
	}
	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
