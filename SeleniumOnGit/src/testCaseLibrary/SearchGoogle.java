package testCaseLibrary;


import org.openqa.selenium.By;

import objectLibrary.browserSetUp;

public class SearchGoogle {
	
	public static void doSearch(){
		
		browserSetUp.driver.findElement(By.id("gs_htif0")).sendKeys("Selenium Tutorial");
		
	}
	
}
