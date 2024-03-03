package generics_Utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.PropertyFile.File_UtilityPROP;
import com.pageObject_Repository.PBLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	public String url;
	public String comp;
	public String userid;
	public String password;
	public String browser;
	public PBLoginPage login;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Connecting the database...");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("parallel execution...");
	}
	
	@BeforeClass //LAUNCHING THE BROWSER...
	
	public void initializeProp() throws Throwable
	{
		//GETTING DATA FROM THE PROPERTY FILE
				File_UtilityPROP config = new File_UtilityPROP();
				url = config.getValuefromPropFile("url"); 
				comp = config.getValuefromPropFile("comp");
				userid = config.getValuefromPropFile("userid");
				password = config.getValuefromPropFile("password");
				browser = config.getValuefromPropFile("browser");
				
		System.out.println("Launching the Browser...");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		
		driver.get(url);
		
	}
	

	
	
}
