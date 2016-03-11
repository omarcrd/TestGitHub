package testSuite;

import objectLibrary.browserSetUp;
import testCaseLibrary.SearchGoogle;

public class TestSuiteOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		browserSetUp.initializeBrowser();	
		SearchGoogle.doSearch();
		browserSetUp.tearDown();
		System.out.println("this is a new req I want to implement");
		System.out.println("This change is applied on Github please fetch those changes to your local and test it");

	}

}
