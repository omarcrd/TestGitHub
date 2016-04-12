package objectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserSetUp {
	
	public static WebDriver driver = null;
	
	public static void initializeBrowser(){
		//System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
		//driver = new InternetExplorerDriver();		
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("security.tls.version.fallback-limit", 1);
		driver = new FirefoxDriver(profile);
		driver.manage().window().maximize();
		driver.get("https://www.google.com.mx");
			
	}
	
	public static void tearDown() throws InterruptedException{
		Thread.sleep(8000);
		driver.quit(); //this is latest version branch
	}
	
}
