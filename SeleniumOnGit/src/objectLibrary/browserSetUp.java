package objectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserSetUp {
	
	public static WebDriver driver = null;
	
	public static void initializeBrowser(){
		System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
		driver = new InternetExplorerDriver();		
		driver.manage().window().maximize();
		driver.get("www.google.com");
			
	}
	
	public static void tearDown() throws InterruptedException{
		Thread.sleep(4000);
		driver.quit();
	}
	
}
